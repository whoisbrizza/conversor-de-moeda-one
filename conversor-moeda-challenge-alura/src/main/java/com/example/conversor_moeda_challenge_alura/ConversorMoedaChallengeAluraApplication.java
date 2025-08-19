package com.example.conversor_moeda_challenge_alura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConversorMoedaChallengeAluraApplication implements CommandLineRunner {

    @Autowired
    private ConversorMoeda conversorMoeda;

    public static void main(String[] args) {
        SpringApplication.run(ConversorMoedaChallengeAluraApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        conversorMoeda.executeProcess();
    }
}
