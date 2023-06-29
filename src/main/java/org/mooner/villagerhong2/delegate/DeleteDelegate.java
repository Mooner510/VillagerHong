package org.mooner.villagerhong2.delegate;

import com.intellij.codeInsight.editorActions.BackspaceHandlerDelegate;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;
import org.mooner.villagerhong2.sound.SoundPlayer;
import org.mooner.villagerhong2.sound.Sounds;

public class DeleteDelegate extends BackspaceHandlerDelegate {

    @Override
    public void beforeCharDeleted(char c, @NotNull PsiFile file, @NotNull Editor editor) {
        SoundPlayer.getInstance().play(Sounds.KICK);
    }

    @Override
    public boolean charDeleted(char c, @NotNull PsiFile file, @NotNull Editor editor) {
//        SoundPlayer.getInstance().play(Sounds.KICK);
        return true;
    }
}
