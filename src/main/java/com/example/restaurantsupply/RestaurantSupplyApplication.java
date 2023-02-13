package com.example.restaurantsupply;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.restaurantsupply.mapper")
@SpringBootApplication
public class RestaurantSupplyApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantSupplyApplication.class, args);
    }

}
