package com.place.domain;

import reactor.core.publisher.Mono;

public class PlaceService {

	private PlaceRepository repository;
	
	public PlaceService(PlaceRepository placeR) {
		this.repository = placeR;
	}

	public Mono<Place> create(Place place){
		return repository.save(place);
	}
}
