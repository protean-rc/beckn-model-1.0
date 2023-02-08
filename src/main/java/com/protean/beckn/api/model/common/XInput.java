package com.protean.beckn.api.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class XInput {
	@JsonProperty("form")
	private Form form;
}
