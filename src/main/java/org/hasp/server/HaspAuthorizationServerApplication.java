package org.hasp.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class HaspAuthorizationServerApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(HaspAuthorizationServerApplication.class, args);
    }

}
