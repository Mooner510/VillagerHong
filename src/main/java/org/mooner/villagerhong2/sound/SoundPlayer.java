package org.mooner.villagerhong2.sound;

import com.intellij.ide.IdeEventQueue;
import com.intellij.openapi.util.Disposer;
import org.mooner.villagerhong2.listener.TypingListener;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineUnavailableException;
import java.io.IOException;

public class SoundPlayer {
    private static SoundPlayer soundPlayer;

    public static SoundPlayer getInstance() {
        if(soundPlayer == null) soundPlayer = new SoundPlayer();
        return soundPlayer;
    }

    private SoundPlayer() {
    }

    public void play(Sounds sounds) {
        sounds.resetStream();
        new Thread(() -> {
            try {
                Clip clip = AudioSystem.getClip();
                clip.open(sounds.getStream());
                clip.start();
                clip.addLineListener(event -> {
                    if(event.getType() == LineEvent.Type.STOP) clip.close();
                });
            } catch (LineUnavailableException | IOException e) {
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
        }).start();
    }
}
