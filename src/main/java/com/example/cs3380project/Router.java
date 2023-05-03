package com.example.cs3380project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.cs3380project.tcpLayers.*;
import java.util.Scanner;

@SpringBootApplication
public class Router implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Router.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Create instances of the layer classes
        Layer applicationLayer = new ApplicationLayer();
        Layer transportLayer = new TransportLayer();
        Layer networkLayer = new NetworkLayer();
        Layer dataLinkLayer = new DataLinkLayer();
        PhysicalLayer physicalLayer = new PhysicalLayer();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of data: ");
        String data = scanner.nextLine();

        // Transmit the data through the layers
        data = applicationLayer.addHeader(data);
        data = transportLayer.addHeader(data);
        data = networkLayer.addHeader(data);
        data = dataLinkLayer.addHeader(data);
        data = physicalLayer.addHeader(data);

        System.out.println("\nRouter A has transmitted the data...\n");

        System.out.println("\nRouter B has received the data...\n");

        // Receive the data through the layers
        data = physicalLayer.removeHeader(data);
        data = dataLinkLayer.removeHeader(data);
        data = networkLayer.removeHeader(data);
        data = transportLayer.removeHeader(data);
        data = applicationLayer.removeHeader(data);
    }
}
