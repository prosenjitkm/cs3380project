package com.example.cs3380project.tcpLayersTests;

import com.example.cs3380project.tcpLayers.TransportLayer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportLayerTest {

    @Test
    void addHeaderAndRemoveHeader() {
        TransportLayer transportLayer = new TransportLayer();
        String originalMessage = "Hello, World!";
        String modifiedMessage = transportLayer.addHeader(originalMessage);
        String recoveredMessage = transportLayer.removeHeader(modifiedMessage);
        assertEquals(originalMessage, recoveredMessage);
    }
}
