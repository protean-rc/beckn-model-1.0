package com.protean.beckn.api.model.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Category {
	private String id;
	
	@JsonProperty("parent_category_id")
	private String parentCategoryId;
	
	private Descriptor descriptor;
	
	private Time time;
	
	private List<TagGroup> tags;
}
