package com.briconote.main.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import se.walkercrou.places.GooglePlaces;
import se.walkercrou.places.Param;
import se.walkercrou.places.Place;

import java.util.List;

@Service("GooglePlacesSearch")
public class GooglePlacesSearchImpl implements GooglePlacesSearch {
	
	@Value("${googleplaces.apikey}")
	private String apiKey;
	
	@Value("${googleplaces.mode}")
	private String mode;
	
	private GooglePlaces setUp() {
		GooglePlaces client = new GooglePlaces(apiKey);
		if (mode.equals("debug")) {
			client.setDebugModeEnabled(true);
		} else {
			client.setDebugModeEnabled(false);
		}
		return client;
	}
	
	public List<Place> searchByText(String searchText,
	                                float latitude,
	                                float longitude,
	                                int radius,
	                                int maxResult)
	{
		GooglePlaces client = setUp();
		return client.getPlacesByQuery(searchText,
			maxResult,
			Param.name("radius").value(radius),
			Param.name("location").value(String.format("%f,%f", latitude, longitude)));
	}
	
}
