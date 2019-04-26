package me.maxpeng.demo.config;

import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * Author: maxpeng
 * Date: 2019-04-26
 * Time: 14:23
 */
@Configuration
public class GRpcConfiguration {
    @Bean
    public Channel createChannel() {
        return ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();
    }
}
