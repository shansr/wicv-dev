package com.weichai.wicv.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//将此Application声明为注册服务中心
@EnableEurekaServer
@SpringBootApplication
public class WicvMsLearnDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(WicvMsLearnDiscoveryApplication.class, args);
    }

}
