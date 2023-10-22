package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponentType;

public class LexemeParser extends AbstractTextParser {
    private static final String LEXEME_REGEX = "\\s+";
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {

        char[] chars = string.toCharArray();
        for (char character : chars){
            AbstractTextComponent symbolLeaf = new SymbolLeaf(TextComponentType.SYMBOL, character);
            abstractTextComponent.add(symbolLeaf);
        }
    }

    // Write your code here!

}