package com.example.orkunenesyuksel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.orkunenesyuksel.model")

@EnableJpaRepositories
public class EnocaOrkunEnesYukselApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnocaOrkunEnesYukselApplication.class, args);
    }


}
