package com.protean.beckn.api.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class XInputRequired {
	@JsonProperty("xinput")
	private XInput xinput;
}
