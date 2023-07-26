package org.kata;

public class EncryptThis {
    public static String encryptThis(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            char firstChar = word.charAt(0);
            String remainingChars = word.substring(1);

            String ascii = String.valueOf((int) firstChar);

            if (remainingChars.length() >= 2) {
                char temp = remainingChars.charAt(0);
                remainingChars = remainingChars.substring(1, remainingChars.length() - 1)
                        + remainingChars.charAt(remainingChars.length() - 1) + temp;
            }

            result.append(ascii).append(remainingChars).append(" ");
        }

        // Remove the trailing space before returning the result
        return result.toString().trim();
    }
}

