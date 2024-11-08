package com.protean.beckn.api.model.common;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class Country {
	@JsonIgnore
	private String name;
	private String code;
}
