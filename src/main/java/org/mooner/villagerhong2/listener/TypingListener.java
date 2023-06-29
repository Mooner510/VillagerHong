package org.mooner.villagerhong2.listener;

import com.intellij.ide.IdeEventQueue;
import org.jetbrains.annotations.NotNull;
import org.mooner.villagerhong2.sound.SoundPlayer;
import org.mooner.villagerhong2.sound.Sounds;

import java.awt.*;
import java.awt.event.KeyEvent;

public class TypingListener implements IdeEventQueue.EventDispatcher {
    @Override
    public boolean dispatch(@NotNull AWTEvent e) {
        if(e instanceof KeyEvent) {
            KeyEvent event = (KeyEvent) e;
            if(event.getID() == KeyEvent.KEY_PRESSED) {
                SoundPlayer.getInstance().play(Sounds.KICK);
            }
        }
        return false;
    }
}
