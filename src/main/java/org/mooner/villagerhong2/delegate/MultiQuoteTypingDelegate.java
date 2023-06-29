package org.mooner.villagerhong2.delegate;

import com.intellij.codeInsight.editorActions.MultiCharQuoteHandler;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.highlighter.HighlighterIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MultiQuoteTypingDelegate implements MultiCharQuoteHandler {
    @Override
    public @Nullable CharSequence getClosingQuote(@NotNull HighlighterIterator iterator, int offset) {
        System.out.println("getClosingQuote");
        return null;
    }

    @Override
    public boolean isClosingQuote(HighlighterIterator iterator, int offset) {
        System.out.println("isClosingQuote");
        return false;
    }

    @Override
    public boolean isOpeningQuote(HighlighterIterator iterator, int offset) {
        System.out.println("isOpeningQuote");
        return false;
    }

    @Override
    public boolean hasNonClosedLiteral(Editor editor, HighlighterIterator iterator, int offset) {
        System.out.println("hasNonClosedLiteral");
        return false;
    }

    @Override
    public boolean isInsideLiteral(HighlighterIterator iterator) {
        System.out.println("isInsideLiteral");
        return false;
    }
}
