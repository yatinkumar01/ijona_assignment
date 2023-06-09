package com.ijona.bookmanagement;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Ijona Book Management", version = "1.0"))
public class IjonaApplication {

    public static void main(String[] args) {
        SpringApplication.run(IjonaApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper()
    {
        return new ModelMapper();
    }

}
