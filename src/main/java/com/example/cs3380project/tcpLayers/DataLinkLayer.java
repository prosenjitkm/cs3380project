package com.example.cs3380project.tcpLayers;

public class DataLinkLayer implements Layer {

    private static final String DATA_LINK_HEADER = "DataLinkHeader";

    @Override
    public String addHeader(String message) {
        System.out.println("\nData Link Layer");
        System.out.println("Received: " + message);
        message = DATA_LINK_HEADER.concat(message);
        System.out.println("Sending: " + message);
        return message;
    }

    @Override
    public String removeHeader(String message) {
        System.out.println("\nData Link Layer");
        System.out.println("Received: " + message);
        message = message.replace(DATA_LINK_HEADER, "");
        System.out.println("Sending: " + message);
        return message;
    }
}
