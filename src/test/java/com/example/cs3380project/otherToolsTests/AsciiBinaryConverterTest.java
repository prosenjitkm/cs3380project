package com.example.cs3380project.otherToolsTests;

import com.example.cs3380project.otherTools.AsciiBinaryConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsciiBinaryConverterTest {

    @Test
    void asciiToBinaryAndBinaryToAscii() {
        String originalMessage = "Hello, World!";
        String binaryMessage = AsciiBinaryConverter.asciiToBinary(originalMessage);
        String recoveredMessage = AsciiBinaryConverter.binaryToAscii(binaryMessage);
        assertEquals(originalMessage, recoveredMessage);
    }
}
