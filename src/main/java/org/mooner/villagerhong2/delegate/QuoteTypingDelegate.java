package org.mooner.villagerhong2.delegate;

import com.intellij.codeInsight.editorActions.QuoteHandler;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.highlighter.HighlighterIterator;

public class QuoteTypingDelegate implements QuoteHandler {
    @Override
    public boolean isClosingQuote(HighlighterIterator iterator, int offset) {
        System.out.println("isClosingQuote");
        return true;
    }

    @Override
    public boolean isOpeningQuote(HighlighterIterator iterator, int offset) {
        System.out.println("isOpeningQuote");
        return true;
    }

    @Override
    public boolean hasNonClosedLiteral(Editor editor, HighlighterIterator iterator, int offset) {
        System.out.println("hasNonClosedLiteral");
        return true;
    }

    @Override
    public boolean isInsideLiteral(HighlighterIterator iterator) {
        System.out.println("isInsideLiteral");
        return true;
    }
}
