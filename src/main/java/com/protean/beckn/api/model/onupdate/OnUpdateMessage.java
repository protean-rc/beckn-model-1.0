package com.protean.beckn.api.model.onupdate;

import com.protean.beckn.api.model.common.Order;

import lombok.Data;

@Data
public class OnUpdateMessage {
	private Order order;
}
