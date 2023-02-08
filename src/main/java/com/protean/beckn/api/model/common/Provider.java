package com.protean.beckn.api.model.common;

import java.util.List;

import java.util.Set;

import lombok.Data;

@Data
public class Provider {
	private String id;
	private Descriptor descriptor;
	private String categoryId;
	private Time time;
	private Set<Category> categories;
	private List<Fulfillment> fulfillments;
	private List<Location> locations;
	private List<Item> items;
	private String exp;
	private String ttl;
	private List<TagData> tags;
}
