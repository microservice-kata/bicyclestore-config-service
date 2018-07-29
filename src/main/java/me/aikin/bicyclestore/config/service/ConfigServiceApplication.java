package me.aikin.bicyclestore.config.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@Slf4j
@EnableConfigServer
@EnableDiscoveryClient
@EnableAutoConfiguration
@SpringBootApplication
public class ConfigServiceApplication {
    public static void main(String[] args) {

        SpringApplication.run(ConfigServiceApplication.class, args);

        log.info("max memory:{} MB", Runtime.getRuntime().maxMemory() / 1024 / 1024);
        log.info("total memory:{} MB", Runtime.getRuntime().totalMemory() / 1024 / 1024);
        log.info("free memory:{} MB", Runtime.getRuntime().freeMemory() / 1024 / 1024);
        log.info("used memory:{} MB", (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024 / 1024);
        log.info("available processors:{}", Runtime.getRuntime().availableProcessors());
    }
}
