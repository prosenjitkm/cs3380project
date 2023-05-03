package com.example.cs3380project.tcpLayersTests;

import com.example.cs3380project.tcpLayers.PhysicalLayer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhysicalLayerTest {

    @Test
    void addHeaderAndRemoveHeader() {
        PhysicalLayer physicalLayer = new PhysicalLayer();
        String originalMessage = "Hello, World!";
        String modifiedMessage = physicalLayer.addHeader(originalMessage);
        String recoveredMessage = physicalLayer.removeHeader(modifiedMessage);
        assertEquals(originalMessage, recoveredMessage);
    }
}
