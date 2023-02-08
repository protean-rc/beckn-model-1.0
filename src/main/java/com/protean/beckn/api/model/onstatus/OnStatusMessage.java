package com.protean.beckn.api.model.onstatus;

import com.protean.beckn.api.model.common.Order;

import lombok.Data;

@Data
public class OnStatusMessage {
	private Order order;
}
