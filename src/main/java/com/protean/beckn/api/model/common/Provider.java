package com.protean.beckn.api.model.common;

import java.util.List;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Provider {
	private String id;
	private Descriptor descriptor;
	
	@JsonProperty("category_id")
	private String categoryId;
	private Time time;
	private Set<Category> categories;
	private List<Fulfillment> fulfillments;
	private List<Location> locations;
	private List<Offer> offers;
	private List<Item> items;
	private String exp;
	private boolean rateable;
	private String ttl;
	private List<TagGroup> tags;
}
