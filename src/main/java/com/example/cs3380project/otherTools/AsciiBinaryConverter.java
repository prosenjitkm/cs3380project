package com.example.cs3380project.otherTools;

public class AsciiBinaryConverter {

    public static String asciiToBinary(String asciiString) {
        StringBuilder binary = new StringBuilder();
        for (char c : asciiString.toCharArray()) {
            String binaryString = Integer.toBinaryString(c);
            binary.append(String.format("%8s", binaryString).replace(' ', '0'));
        }
        return binary.toString();
    }

    public static String binaryToAscii(String binaryString) {
        StringBuilder ascii = new StringBuilder();
        for (int i = 0; i < binaryString.length(); i += 8) {
            String binarySubstring = binaryString.substring(i, i + 8);
            char asciiChar = (char) Integer.parseInt(binarySubstring, 2);
            ascii.append(asciiChar);
        }
        return ascii.toString();
    }
}
