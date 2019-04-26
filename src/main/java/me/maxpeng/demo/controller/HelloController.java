package me.maxpeng.demo.controller;

import io.grpc.Channel;
import me.maxpeng.demo.HelloRequest;
import me.maxpeng.demo.HelloResponse;
import me.maxpeng.demo.HelloServiceGrpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Author: maxpeng
 * Date: 2019-04-24
 * Time: 15:33
 */
@RestController
public class HelloController {

    @Autowired
    private Channel channel;

    @GetMapping("/hello")
    public String hello() {
        HelloServiceGrpc.HelloServiceBlockingStub stub = HelloServiceGrpc.newBlockingStub(channel);
        HelloResponse response = stub.hello(HelloRequest.newBuilder()
            .setFirstName("Jim")
            .setLastName("Green")
            .build());

        return response.getGreeting();
    }
}
