package com.fipe.service;

import com.fipe.database.repository.MarcaRepository;
import com.fipe.service.marca.MarcaService;
import com.fipe.service.webflux.WebFluxRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {
    @Bean
    public MarcaService marcaService(WebFluxRepository webFluxRepository, MarcaRepository marcaRepository) {
        return new MarcaService(webFluxRepository, marcaRepository);
    }
}
