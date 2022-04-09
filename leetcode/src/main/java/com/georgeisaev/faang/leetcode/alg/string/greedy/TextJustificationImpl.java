package com.georgeisaev.faang.leetcode.alg.string.greedy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TextJustificationImpl implements TextJustification {

    public static void main(String[] args) {
        new TextJustificationImpl().fullJustify(new String[]{
                "Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a", "computer"
                , "Art", "is", "everything", "else", "we", "do"
        }, 20);
    }

    @Override
    public List<String> fullJustify(String[] words, int maxWidth) {
        // Iterate over word and count a current width
        // in case the current width is exceeded max width construct a line and start new line
        List<String> result = new LinkedList<>();
        List<String> currentLineWords = new ArrayList<>();
        int currentWidth = 0;
        for (String word : words) {
            if (currentWidth + currentLineWords.size() + word.length() > maxWidth) {
                // Print a current line
                currentWidth = printLine(maxWidth, result, currentLineWords, currentWidth);
            }
            currentWidth += word.length();
            currentLineWords.add(word);
        }

        if (!currentLineWords.isEmpty()) {
            // Print the last word
            printLastLine(maxWidth, result, currentLineWords, currentWidth);
        }
        return result;
    }

    private int printLine(int maxWidth, List<String> result, List<String> currentLineWords, int currentWidth) {
        StringBuilder builder = new StringBuilder();
        int spaceWidth = maxWidth - currentWidth;
        int spaceLength = currentLineWords.size() == 1
                ? spaceWidth
                : spaceWidth / (currentLineWords.size() - 1);
        int additionalSpaceLength = currentLineWords.size() == 1
                ? 0
                : spaceWidth - spaceLength * (currentLineWords.size() - 1);
        for (String currentLineWord : currentLineWords) {
            builder.append(currentLineWord);
            if (spaceWidth > 0) {
                int currentSpace = Math.min(spaceWidth, spaceLength + (additionalSpaceLength > 0 ? 1 : 0));
                builder.append(" ".repeat(currentSpace));
                spaceWidth -= currentSpace;
                if (additionalSpaceLength > 0) {
                    additionalSpaceLength--;
                }
            }
        }
        result.add(builder.toString());
        currentLineWords.clear();
        currentWidth = 0;
        return currentWidth;
    }

    private void printLastLine(int maxWidth, List<String> result, List<String> currentLineWords, int currentWidth) {
        StringBuilder builder = new StringBuilder();
        int spaceWidth = maxWidth - currentWidth;
        for (String currentLineWord : currentLineWords) {
            builder.append(currentLineWord);
            if (spaceWidth > 0) {
                builder.append(" ");
                spaceWidth--;
            }
        }
        if (spaceWidth > 0) {
            builder.append(" ".repeat(spaceWidth));
        }
        result.add(builder.toString());
    }

}
