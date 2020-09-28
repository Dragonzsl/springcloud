package com.shilin.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shilin
 * @create 2020-09-28 09:47
 */
@Configuration
public class MyRibbonRule {
    @Bean
    public IRule getRule(){
        return new RandomRule();
    }
}
