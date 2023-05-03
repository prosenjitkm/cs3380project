package com.example.cs3380project.tcpLayers;

public class ApplicationLayer implements Layer {

    private static final String APPLICATION_HEADER = "ApplicationHeader";

    @Override
    public String addHeader(String message) {
        System.out.println("\nApplication Layer");
        System.out.println("Received: " + message);
        message = APPLICATION_HEADER.concat(message);
        System.out.println("Sending: " + message);
        return message;
    }

    @Override
    public String removeHeader(String message) {
        System.out.println("\nApplication Layer");
        System.out.println("Received: " + message);
        message = message.replace(APPLICATION_HEADER, "");
        System.out.println("Interpreted: " + message);
        return message;
    }
}
