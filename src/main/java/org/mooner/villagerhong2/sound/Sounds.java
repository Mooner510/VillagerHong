package org.mooner.villagerhong2.sound;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.net.URL;

public enum Sounds {
    KICK("sounds/kick.wav");

    private final String path;
    private static final AudioInputStream[] streams = new AudioInputStream[Sounds.values().length];

    Sounds(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public AudioInputStream getStream() {
        return streams[this.ordinal()];
    }

    public void resetStream() {
        new Thread(() -> {
            try {
                URL url = getClass().getClassLoader().getResource(path);
                if(url != null) streams[this.ordinal()] = AudioSystem.getAudioInputStream(url);
                else throw new IOException();
            } catch (UnsupportedAudioFileException | IOException e) {
                System.out.println("Error: Cannot read File");
                e.printStackTrace();
            }
        }).start();
    }
}
