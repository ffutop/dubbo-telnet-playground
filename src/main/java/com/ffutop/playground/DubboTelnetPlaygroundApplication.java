package com.ffutop.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo/dubbo-provider.xml")
public class DubboTelnetPlaygroundApplication {

    public static void main(String[] args) throws InterruptedException {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(DubboTelnetPlaygroundApplication.class, args);
        for (;;) {
            Thread.sleep(1000);
        }
    }

}
