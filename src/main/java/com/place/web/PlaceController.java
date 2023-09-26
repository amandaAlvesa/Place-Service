package com.place.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.place.domain.Place;
import com.place.domain.PlaceService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/places")
public class PlaceController {

	@Autowired
	private PlaceService service;
	
	public PlaceController(PlaceService pService) {
		this.service = pService;
	}
	
	@PostMapping
	public ResponseEntity<Mono<Place>> create(Place place){
		var createdPlace = service.create(place);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdPlace);
	}
}
