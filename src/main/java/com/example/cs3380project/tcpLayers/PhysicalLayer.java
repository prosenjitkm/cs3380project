package com.example.cs3380project.tcpLayers;

import com.example.cs3380project.otherTools.AsciiBinaryConverter;

public class PhysicalLayer implements Layer {

    private static final String PHYSICAL_LINK_HEADER = "PhysicalLinkHeader";

    @Override
    public String addHeader(String message) {
        System.out.println("\nPhysical Layer");
        System.out.println("Received: " + message);
        message = PHYSICAL_LINK_HEADER.concat(message);
        message = AsciiBinaryConverter.asciiToBinary(message);
        System.out.println("Sending: " + message);
        return message;
    }

    @Override
    public String removeHeader(String message) {
        System.out.println("\nPhysical Layer");
        System.out.println("Received: " + message);
        message = AsciiBinaryConverter.binaryToAscii(message);
        message = message.replace(PHYSICAL_LINK_HEADER, "");
        System.out.println("Sending: " + message);
        return message;
    }
}
