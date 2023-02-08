package com.protean.beckn.api.model.oninit;

import com.protean.beckn.api.model.common.Order;

import lombok.Data;

@Data
public class OnInitMessage {
	private Order order;
}
