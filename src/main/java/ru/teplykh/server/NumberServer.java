package ru.teplykh.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class NumberServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080).addService(new NumberServiceImpl()).build();

        server.start();

        System.out.println("Server started");

        server.awaitTermination();
    }
}
