package com.protean.beckn.api.model.update;

import com.protean.beckn.api.model.common.Order;

import lombok.Data;

@Data
public class UpdateMessage {
	private String updateTarget;
	private Order order;
}
