package me.maxpeng.demo.server.service;


import io.grpc.stub.StreamObserver;
import me.maxpeng.demo.server.HelloRequest;
import me.maxpeng.demo.server.HelloResponse;
import me.maxpeng.demo.server.HelloServiceGrpc;
import org.lognet.springboot.grpc.GRpcService;

/**
 * Created by IntelliJ IDEA.
 * Author: maxpeng
 * Date: 2019-04-24
 * Time: 15:23
 */

@GRpcService
public class HelloService extends HelloServiceGrpc.HelloServiceImplBase {
    @Override
    public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        HelloResponse.Builder builder = HelloResponse.newBuilder().setGreeting("hello " + request.getFirstName() + " " + request.getLastName());
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
}
