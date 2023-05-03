package com.example.cs3380project.tcpLayers;

public class NetworkLayer implements Layer {

    private static final String NETWORK_HEADER = "NetworkHeader";

    @Override
    public String addHeader(String message) {
        System.out.println("\nNetwork Layer");
        System.out.println("Received: " + message);
        message = NETWORK_HEADER.concat(message);
        System.out.println("Sending: " + message);
        return message;
    }

    @Override
    public String removeHeader(String message) {
        System.out.println("\nNetwork Layer");
        System.out.println("Received: " + message);
        message = message.replace(NETWORK_HEADER, "");
        System.out.println("Sending: " + message);
        return message;
    }
}
