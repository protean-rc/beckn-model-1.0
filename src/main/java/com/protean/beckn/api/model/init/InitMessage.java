package com.protean.beckn.api.model.init;

import com.protean.beckn.api.model.common.Order;

import lombok.Data;

@Data
public class InitMessage {
	private Order order;
}
