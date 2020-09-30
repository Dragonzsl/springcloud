package com.shilin.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

/**
 * @author shilin
 * @create 2020-09-29 11:41
 */
@SpringBootApplication
@EnableHystrixDashboard
public class ConsumerDashboardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDashboardMain9001.class, args);
    }
}
