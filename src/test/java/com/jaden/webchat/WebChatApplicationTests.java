package com.jaden.webchat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Mono;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import  org.springframework.web.reactive.socket.client.WebSocketClient;
import  org.springframework.web.reactive.socket.client.ReactorNettyWebSocketClient;


@RunWith(SpringRunner.class)
@SpringBootTest
public class WebChatApplicationTests {

    @Test
    public void contextLoads() throws MalformedURLException, URISyntaxException

    {
    }

    public static void main(String[] args) throws URISyntaxException {
        WebSocketClient client = new ReactorNettyWebSocketClient();
        client.execute(new URI("ws://localhost:8080/ws/chat/"), session -> {
            return Mono.empty();
        }).block(Duration.ofMillis(10000));



    }





}
