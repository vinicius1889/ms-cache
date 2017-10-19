package br.com.icarros.configs;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyBean {

    @Scope("prototype")
    @Bean
    public RestTemplate createRestTemplate(){
        return new RestTemplate();
    }

    @Scope("prototype")
    @Bean
    public ObjectMapper createObjectMapper(){
        return new ObjectMapper();
    }


    @Scope("prototype")
    @Bean
    public KeycloakBean createKeycloakbean(){ return new KeycloakBean(); }



}
