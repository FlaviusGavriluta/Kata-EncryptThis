package org.kata;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EncryptThis {
    public static String encryptThis(String text) {
        return Arrays.stream(text.split(" ")).
                map(word -> word.length() > 2 ?
                        (int) word.charAt(0) + word.substring(word.length() - 1)
                                + word.substring(2, word.length() - 1) + word.charAt(1) :
                        word.length() > 1 ?
                                (int) word.charAt(0) + word.substring(1) :
                                word.length() == 1 ? (int) word.charAt(0) + "" : "")
                .collect(Collectors.joining(" "));
    }
}