package com.shilin.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shilin
 * @create 2020-09-28 12:57
 */
@Configuration
public class MyFeignConf {
    @Bean
    Logger.Level getLoggerLevel(){
        return Logger.Level.FULL;
    }
}
