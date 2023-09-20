package com.furkankaya.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocation(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route("product-service-route", r ->
                        r.path("/product-service/**")
                                .filters(f -> f.rewritePath("/product-service/(?<segment>.*)", "/${segment}"))
                                // eureka bunu bildigi icin oradan cekiyoruz
                                .uri("lb://product-service")
                )
                .route("order-service-route", r ->
                        r.path("/order-service/**")
                                .filters(f -> f.rewritePath("/order-service/(?<segment>.*)", "/${segment}"))
                                // eureka bunu bildigi icin oradan cekiyoruz
                                .uri("lb://order-service")
                )
                .build();
    }

}
