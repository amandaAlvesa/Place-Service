package com.place.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.place.domain.PlaceRepository;
import com.place.domain.PlaceService;

@Configuration
public class PlaceConfig {

	@Bean
	PlaceService service(PlaceRepository repository){
		return new PlaceService(repository);
	}
}
