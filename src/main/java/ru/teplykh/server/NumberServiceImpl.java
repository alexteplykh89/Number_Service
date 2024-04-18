package ru.teplykh.server;

import io.grpc.stub.StreamObserver;
import ru.teplykh.grpc.NumberServiceGrpc;
import ru.teplykh.grpc.NumberServiceOuterClass;

public class NumberServiceImpl extends NumberServiceGrpc.NumberServiceImplBase {
    public void generate(NumberServiceOuterClass.NumberRequest request,
                         StreamObserver<NumberServiceOuterClass.NumberResponse> responseObserver) {
        for (int i = 1; i < request.getLastValue() - request.getFirstValue(); i++) {
            NumberServiceOuterClass.NumberResponse response = NumberServiceOuterClass.NumberResponse
                    .newBuilder().setNumber(request.getFirstValue() + i)
                    .build();

            responseObserver.onNext(response);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        responseObserver.onCompleted();
    }
}
