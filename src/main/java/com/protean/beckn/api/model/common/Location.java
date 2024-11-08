package com.protean.beckn.api.model.common;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class Location {
	@JsonIgnore
	private String id;
	@JsonIgnore
	private Descriptor descriptor;
	@JsonIgnore
	private String map_url;
	@JsonIgnore
	private String gps;
	@JsonIgnore
	private String address;
	@JsonIgnore
	private City city;
	@JsonIgnore
	private String district;
	@JsonIgnore
	private State state;
	private Country country;
	@JsonIgnore
	private String area_code;
	@JsonIgnore
	private Circle circle;
	@JsonIgnore
	private String polygon;
	
//	@JsonProperty("3dspace")
	@JsonIgnore
	private String threeDSpace;
	@JsonIgnore
	private String rating;
}


