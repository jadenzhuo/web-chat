package com.jaden.webchat.config;

import com.jaden.webchat.handler.WebChatHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.HandlerAdapter;
import org.springframework.web.reactive.HandlerMapping;
import org.springframework.web.reactive.handler.SimpleUrlHandlerMapping;
import org.springframework.web.reactive.socket.HandshakeInfo;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.server.support.WebSocketHandlerAdapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author syncwt
 * @version V1.0
 * @Title:
 * @Package
 * @Description: TODO
 * @date
 */

@Configuration
public class WebSocketConfiguration {

    @Autowired
    private WebChatHandler webSocketHandler;

    @Bean
    public HandlerMapping webSocketHandlerMapping(){
        Map<String,WebSocketHandler> handlerMap=new HashMap<>();
        handlerMap.put("/ws/chat/",webSocketHandler);

        SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
        mapping.setOrder(Ordered.HIGHEST_PRECEDENCE);
        mapping.setUrlMap(handlerMap);
        return mapping;
    }

    @Bean
    public WebSocketHandlerAdapter handlerAdapter(){
        return new WebSocketHandlerAdapter();
    }
}
