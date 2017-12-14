package com.briconote.main.service;

import com.briconote.main.DemoApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import se.walkercrou.places.Place;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class GooglePlacesUT {

	@Resource(name = "GooglePlacesSearch")
	GooglePlacesSearch googlePlacesSearch;
	
	@Test
	public void testPlaceSearch() {
		String textSearch = "plombier";
		float latitude = 48.8975732f;
		float longitude = 2.2223856f;
		int radius = 500;
		int maxResult = 100;
		List<Place> placesList = googlePlacesSearch.searchByText
			(textSearch,
			latitude,
			longitude, radius, maxResult);
		Assert.assertTrue(placesList.size() > 10);
	}
}
