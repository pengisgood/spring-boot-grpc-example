# Spring boot grpc example

## Dependencies

Server side:
* [Google protobuf gradle plugin](https://github.com/google/protobuf-gradle-plugin)
* [Spring boot web starter](https://spring.io/guides/gs/spring-boot/)
* [Grpc spring boot starter](https://github.com/LogNet/grpc-spring-boot-starter)

Client side:
* [Google protobuf gradle plugin](https://github.com/google/protobuf-gradle-plugin)
* [Spring boot web starter](https://spring.io/guides/gs/spring-boot/)
* Grpc related jars
```shell
implementation "io.grpc:grpc-netty:${grpcVersion}"
implementation "io.grpc:grpc-protobuf:${grpcVersion}"
implementation "io.grpc:grpc-stub:${grpcVersion}"
```

## How to run

1. Start the grpc server
```shell
cd server
./gradlew bootRun
```
After a while, the grpc server is listening on port `6565`.

2. Start the client
```shell
# go the project root directory

./gradlew bootRun
``` 

After a while, the spring boot is listening on port `8080`.

## How to test

Send a request like this `curl localhost:8080/hello`, then you will get a response `hello Jim Green` if everything goes well. 

