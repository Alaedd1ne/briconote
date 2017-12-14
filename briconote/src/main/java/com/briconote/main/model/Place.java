package com.briconote.main.model;

import se.walkercrou.places.Photo;
import se.walkercrou.places.Price;
import se.walkercrou.places.Review;
import se.walkercrou.places.Scope;
import se.walkercrou.places.Status;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity(name="Place")
public class Place implements Serializable {
	
	@Id
	@Column
	private Long id;
	
	@Column
	private final List<String> types = new ArrayList<>();
	@Column
	private final List<Photo> photos = new ArrayList<>();
	@Column
	private final List<Review> reviews = new ArrayList<>();
	@Column
	private String placeId;
	@Column
	private Scope scope;
	@Column
	private double lat = -1;
	@Column
	private double lng = -1;
	@Column
	private String name;
	@Column
	private String address;
	@Column
	private String simpleAddress;
	@Column
	private double rating = -1;
	@Column
	private Status status = Status.NONE;
	@Column
	private Price price = Price.NONE;
	@Column
	private String phone;
	@Column
	private String internationalPhone;
	@Column
	private String googleUrl;
	@Column
	private String website;
//	@Column
//	private Hours hours;
	@Column
	private int utcOffset;
	
	public Place() {
	}
	
	public class PlaceBuilder {
	
	}
	
	public Long getId() {
		return id;
	}
	
	private void setId(Long id) {
		this.id = id;
	}
	
	public List<String> getTypes() {
		return types;
	}
	
	public List<Photo> getPhotos() {
		return photos;
	}
	
	public List<Review> getReviews() {
		return reviews;
	}
	
	public String getPlaceId() {
		return placeId;
	}
	
	private void setPlaceId(String placeId) {
		this.placeId = placeId;
	}
	
	public Scope getScope() {
		return scope;
	}
	
	private void setScope(Scope scope) {
		this.scope = scope;
	}
	
	public double getLat() {
		return lat;
	}
	
	private void setLat(double lat) {
		this.lat = lat;
	}
	
	public double getLng() {
		return lng;
	}
	
	private void setLng(double lng) {
		this.lng = lng;
	}
	
	public String getName() {
		return name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	private void setAddress(String address) {
		this.address = address;
	}
	
	public String getSimpleAddress() {
		return simpleAddress;
	}
	
	private void setSimpleAddress(String simpleAddress) {
		this.simpleAddress = simpleAddress;
	}
	
	public double getRating() {
		return rating;
	}
	
	private void setRating(double rating) {
		this.rating = rating;
	}
	
	public Status getStatus() {
		return status;
	}
	
	private void setStatus(Status status) {
		this.status = status;
	}
	
	public Price getPrice() {
		return price;
	}
	
	private void setPrice(Price price) {
		this.price = price;
	}
	
	public String getPhone() {
		return phone;
	}
	
	private void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getInternationalPhone() {
		return internationalPhone;
	}
	
	private void setInternationalPhone(String internationalPhone) {
		this.internationalPhone = internationalPhone;
	}
	
	public String getGoogleUrl() {
		return googleUrl;
	}
	
	private void setGoogleUrl(String googleUrl) {
		this.googleUrl = googleUrl;
	}
	
	public String getWebsite() {
		return website;
	}
	
	private void setWebsite(String website) {
		this.website = website;
	}
	
	public int getUtcOffset() {
		return utcOffset;
	}
	
	private void setUtcOffset(int utcOffset) {
		this.utcOffset = utcOffset;
	}
	
	
}
