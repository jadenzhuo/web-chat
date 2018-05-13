package com.jaden.webchat.interceptor;

import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

/**
 * @author jaden
 * @version V1.0
 * @Title:
 * @Package
 * @Description: TODO
 * @date
 */
public class IPHandlerFilter implements WebFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain
    ) {

        //chain.filter()


        return null;
    }
}
