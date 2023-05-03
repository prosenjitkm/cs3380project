package com.example.cs3380project.tcpLayersTests;

import com.example.cs3380project.tcpLayers.NetworkLayer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NetworkLayerTest {

    @Test
    void addHeaderAndRemoveHeader() {
        NetworkLayer networkLayer = new NetworkLayer();
        String originalMessage = "Hello, World!";
        String modifiedMessage = networkLayer.addHeader(originalMessage);
        String recoveredMessage = networkLayer.removeHeader(modifiedMessage);
        assertEquals(originalMessage, recoveredMessage);
    }
}
