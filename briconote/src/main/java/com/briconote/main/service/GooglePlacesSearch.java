package com.briconote.main.service;

import se.walkercrou.places.Place;

import java.util.List;

interface GooglePlacesSearch {
	
	List<Place> searchByText(String searchText,
	                          float latitude,
	                          float longitude,
	                          int radius,
	                          int maxResult);
}
