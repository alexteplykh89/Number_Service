package ru.teplykh.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import ru.teplykh.grpc.NumberServiceGrpc;
import ru.teplykh.grpc.NumberServiceOuterClass;

public class NumberClient {
    private static int currentValue = 0;

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8080")
                .usePlaintext().build();

        NumberServiceGrpc.NumberServiceStub stub = NumberServiceGrpc.newStub(channel);

        NumberServiceOuterClass.NumberRequest request = NumberServiceOuterClass.NumberRequest
                .newBuilder()
                    .setFirstValue(1)
                    .setLastValue(30)
                .build();

        ClientStreamObserver clientStreamObserver = new ClientStreamObserver();

        stub.generate(request, clientStreamObserver);

        for (int i = 0; i < 50; i++) {
            System.out.println("currentValue: " + getCurrentValue(clientStreamObserver.getLastValue()));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        channel.shutdownNow();
    }

    private static int getCurrentValue(int lastValue) {
        currentValue = currentValue + lastValue + 1;
        return currentValue;
    }
}
