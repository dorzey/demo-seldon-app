package com.example.demo.config;

import org.springframework.boot.web.embedded.netty.NettyReactiveWebServerFactory;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.context.annotation.Bean;

public class NettyAppConfig {
    //    @Bean
//    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//    public EmbeddedServletContainerCustomizer containerCustomizer() {
//        return new CustomizationBean();
//    }
//

    @Bean
    public ConfigurableWebServerFactory tomcatCustomizer() {
        final NettyReactiveWebServerFactory factory = new NettyReactiveWebServerFactory();
        return factory;
    }
}
