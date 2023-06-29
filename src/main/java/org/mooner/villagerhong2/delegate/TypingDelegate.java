package org.mooner.villagerhong2.delegate;

import com.intellij.codeInsight.editorActions.TypedHandlerDelegate;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;
import org.mooner.villagerhong2.sound.SoundPlayer;
import org.mooner.villagerhong2.sound.Sounds;

public class TypingDelegate extends TypedHandlerDelegate {

    @Override
    public @NotNull Result charTyped(char c, @NotNull Project project, @NotNull Editor editor, @NotNull PsiFile file) {
        SoundPlayer.getInstance().play(Sounds.KICK);
        return Result.DEFAULT;
    }
}
