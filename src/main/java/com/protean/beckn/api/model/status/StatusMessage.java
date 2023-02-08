package com.protean.beckn.api.model.status;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class StatusMessage {
	@JsonProperty("order_id")
	private String orderId;
}
