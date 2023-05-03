package com.example.cs3380project.tcpLayers;

public interface Layer {
    String addHeader(String message);
    String removeHeader(String message);
}
