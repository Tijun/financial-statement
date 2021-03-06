package com.financial.statement.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;


@Configuration
public class Routes {

    RouterFunction<?> routerFunction(){
        return route(GET("").and(accept(MediaType.APPLICATION_JSON)),null);
    }
}
