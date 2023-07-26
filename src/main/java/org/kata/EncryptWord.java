package org.kata;

public class EncryptWord {
    public static String encryptWord(String word) {
        if (word.length() == 0) {
            return "";
        } else if (word.length() == 1) {
            return Integer.toString(word.charAt(0));
        }

        char[] characters = word.toCharArray();
        int firstLetterAscii = characters[0];
        char secondLetter = characters[1];
        char lastLetter = characters[characters.length - 1];

        characters[0] = (char) firstLetterAscii;
        characters[1] = lastLetter;
        characters[characters.length - 1] = secondLetter;

        return new String(characters);
    }
}
