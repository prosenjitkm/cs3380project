package com.example.cs3380project.tcpLayersTests;

import com.example.cs3380project.tcpLayers.ApplicationLayer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationLayerTest {

    @Test
    void addHeaderAndRemoveHeader() {
        ApplicationLayer applicationLayer = new ApplicationLayer();
        String originalMessage = "Hello, World!";
        String modifiedMessage = applicationLayer.addHeader(originalMessage);
        String recoveredMessage = applicationLayer.removeHeader(modifiedMessage);
        assertEquals(originalMessage, recoveredMessage);
    }
}