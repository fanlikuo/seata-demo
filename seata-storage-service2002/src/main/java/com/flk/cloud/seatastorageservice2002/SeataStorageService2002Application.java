package com.flk.cloud.seatastorageservice2002;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan(basePackages = {"com.flk.cloud.seatastorageservice2002.dao"})
public class SeataStorageService2002Application {

    public static void main(String[] args) {
        SpringApplication.run(SeataStorageService2002Application.class, args);
    }

}
