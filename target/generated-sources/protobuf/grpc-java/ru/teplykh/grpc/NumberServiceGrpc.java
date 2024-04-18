package ru.teplykh.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: NumberService.proto")
public final class NumberServiceGrpc {

  private NumberServiceGrpc() {}

  public static final String SERVICE_NAME = "ru.teplykh.grpc.NumberService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ru.teplykh.grpc.NumberServiceOuterClass.NumberRequest,
      ru.teplykh.grpc.NumberServiceOuterClass.NumberResponse> getGenerateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "generate",
      requestType = ru.teplykh.grpc.NumberServiceOuterClass.NumberRequest.class,
      responseType = ru.teplykh.grpc.NumberServiceOuterClass.NumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ru.teplykh.grpc.NumberServiceOuterClass.NumberRequest,
      ru.teplykh.grpc.NumberServiceOuterClass.NumberResponse> getGenerateMethod() {
    io.grpc.MethodDescriptor<ru.teplykh.grpc.NumberServiceOuterClass.NumberRequest, ru.teplykh.grpc.NumberServiceOuterClass.NumberResponse> getGenerateMethod;
    if ((getGenerateMethod = NumberServiceGrpc.getGenerateMethod) == null) {
      synchronized (NumberServiceGrpc.class) {
        if ((getGenerateMethod = NumberServiceGrpc.getGenerateMethod) == null) {
          NumberServiceGrpc.getGenerateMethod = getGenerateMethod =
              io.grpc.MethodDescriptor.<ru.teplykh.grpc.NumberServiceOuterClass.NumberRequest, ru.teplykh.grpc.NumberServiceOuterClass.NumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "generate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.teplykh.grpc.NumberServiceOuterClass.NumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.teplykh.grpc.NumberServiceOuterClass.NumberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NumberServiceMethodDescriptorSupplier("generate"))
              .build();
        }
      }
    }
    return getGenerateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NumberServiceStub newStub(io.grpc.Channel channel) {
    return new NumberServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NumberServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NumberServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NumberServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NumberServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class NumberServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void generate(ru.teplykh.grpc.NumberServiceOuterClass.NumberRequest request,
        io.grpc.stub.StreamObserver<ru.teplykh.grpc.NumberServiceOuterClass.NumberResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenerateMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ru.teplykh.grpc.NumberServiceOuterClass.NumberRequest,
                ru.teplykh.grpc.NumberServiceOuterClass.NumberResponse>(
                  this, METHODID_GENERATE)))
          .build();
    }
  }

  /**
   */
  public static final class NumberServiceStub extends io.grpc.stub.AbstractStub<NumberServiceStub> {
    private NumberServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NumberServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NumberServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NumberServiceStub(channel, callOptions);
    }

    /**
     */
    public void generate(ru.teplykh.grpc.NumberServiceOuterClass.NumberRequest request,
        io.grpc.stub.StreamObserver<ru.teplykh.grpc.NumberServiceOuterClass.NumberResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGenerateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NumberServiceBlockingStub extends io.grpc.stub.AbstractStub<NumberServiceBlockingStub> {
    private NumberServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NumberServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NumberServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NumberServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<ru.teplykh.grpc.NumberServiceOuterClass.NumberResponse> generate(
        ru.teplykh.grpc.NumberServiceOuterClass.NumberRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGenerateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NumberServiceFutureStub extends io.grpc.stub.AbstractStub<NumberServiceFutureStub> {
    private NumberServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NumberServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NumberServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NumberServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GENERATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NumberServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NumberServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GENERATE:
          serviceImpl.generate((ru.teplykh.grpc.NumberServiceOuterClass.NumberRequest) request,
              (io.grpc.stub.StreamObserver<ru.teplykh.grpc.NumberServiceOuterClass.NumberResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NumberServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NumberServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.teplykh.grpc.NumberServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NumberService");
    }
  }

  private static final class NumberServiceFileDescriptorSupplier
      extends NumberServiceBaseDescriptorSupplier {
    NumberServiceFileDescriptorSupplier() {}
  }

  private static final class NumberServiceMethodDescriptorSupplier
      extends NumberServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NumberServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NumberServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NumberServiceFileDescriptorSupplier())
              .addMethod(getGenerateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
