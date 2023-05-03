package com.example.cs3380project.tcpLayers;

public class TransportLayer implements Layer {

    private static final String TRANSPORT_HEADER = "TransportHeader";

    @Override
    public String addHeader(String message) {
        System.out.println("\nTransport Layer");
        System.out.println("Received: " + message);
        message = TRANSPORT_HEADER.concat(message);
        System.out.println("Sending: " + message);
        return message;
    }

    @Override
    public String removeHeader(String message) {
        System.out.println("\nTransport Layer");
        System.out.println("Received: " + message);
        message = message.replace(TRANSPORT_HEADER, "");
        System.out.println("Sending: " + message);
        return message;
    }
}
