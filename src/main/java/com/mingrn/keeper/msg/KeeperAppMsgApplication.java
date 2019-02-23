package com.mingrn.keeper.msg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RestController;


@EnableAsync
@RestController
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = "com.mingrn.keeper")
public class KeeperAppMsgApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeeperAppMsgApplication.class, args);
    }

}
