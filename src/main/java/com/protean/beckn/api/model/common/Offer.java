package com.protean.beckn.api.model.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Offer {
	private String id;
	private Descriptor descriptor;
	
	@JsonProperty("location_ids")
	private List<String> locationIds;
	
	@JsonProperty("category_ids")
	private List<String> categoryIds;
	
	@JsonProperty("item_ids")
	private List<String> itemIds;
	
	private Time time;
	
	private List<TagGroup> tags;
}
