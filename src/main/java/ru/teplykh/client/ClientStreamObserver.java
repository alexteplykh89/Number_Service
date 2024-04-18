package ru.teplykh.client;

import io.grpc.stub.StreamObserver;
import ru.teplykh.grpc.NumberServiceOuterClass;

public class ClientStreamObserver implements StreamObserver<NumberServiceOuterClass.NumberResponse> {
    private int lastValue = 0;

    @Override
    public void onNext(NumberServiceOuterClass.NumberResponse response) {
        setLastValue(response.getNumber());
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onCompleted() {

    }

    private void setLastValue(int value) {
        this.lastValue = value;
    }

    public int getLastValue() {
        int lastValuePrev = this.lastValue;
        this.lastValue = 0;
        return lastValuePrev;
    }
}
