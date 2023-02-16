package com.protean.beckn.api.model.select;

import com.protean.beckn.api.model.common.Order;

import lombok.Data;

@Data
public class SelectMessage {
	private Order order;
}
