package org.kata;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        out.println(EncryptThis.encryptThis("Hello")); // Output: 72olle
        out.println(EncryptThis.encryptThis("good")); // Output: 103doo
        out.println(EncryptThis.encryptThis("hello world")); // Output: 104olle 119drlo
    }
}