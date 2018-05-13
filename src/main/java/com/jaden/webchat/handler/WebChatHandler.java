package com.jaden.webchat.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.socket.HandshakeInfo;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketSession;
import reactor.core.publisher.Mono;

/**
 * @author  zhuofeng
 * @date 2018/05/03
 */
@Component
public  class WebChatHandler implements WebSocketHandler {
    @Override
    public Mono<Void> handle(WebSocketSession webSocketSession) {

       // webSocketSession.close();
        System.out.println("----------------");

        HandshakeInfo handshakeInfo  = webSocketSession.getHandshakeInfo();

        System.out.println("----------------"+handshakeInfo);

        return webSocketSession.send(webSocketSession.receive().map(msg->webSocketSession.textMessage("ECHO"+msg.getPayloadAsText())));
    }

}
