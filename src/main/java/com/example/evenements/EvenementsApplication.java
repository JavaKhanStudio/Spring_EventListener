package com.example.evenements;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import com.example.evenements.service.InscriptionService;

@SpringBootApplication
@EnableAsync
public class EvenementsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EvenementsApplication.class, args);
    }

    @Bean
    CommandLineRunner demo(InscriptionService service) {
        return args -> {
            service.inscrire("alice");
            service.inscrire("bruno");
            service.inscrire("amelie");
        };
    }
}
