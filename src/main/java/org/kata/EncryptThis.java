package org.kata;

public class EncryptThis {
    public static String encryptThis(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        String[] words = text.split("\\s+");
        StringBuilder encryptedMessage = new StringBuilder();

        for (String word : words) {
            encryptedMessage.append(EncryptWord.encryptWord(word)).append(" ");
        }

        // Remove the trailing space and return the encrypted message
        return encryptedMessage.toString().trim();
    }
}

