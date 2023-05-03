package com.example.cs3380project.tcpLayersTests;

import com.example.cs3380project.tcpLayers.DataLinkLayer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataLinkLayerTest {

    @Test
    void addHeaderAndRemoveHeader() {
        DataLinkLayer dataLinkLayer = new DataLinkLayer();
        String originalMessage = "Hello, World!";
        String modifiedMessage = dataLinkLayer.addHeader(originalMessage);
        String recoveredMessage = dataLinkLayer.removeHeader(modifiedMessage);
        assertEquals(originalMessage, recoveredMessage);
    }
}
