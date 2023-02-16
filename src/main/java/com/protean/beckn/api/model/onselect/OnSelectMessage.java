package com.protean.beckn.api.model.onselect;

import com.protean.beckn.api.model.common.Order;

import lombok.Data;

@Data
public class OnSelectMessage {
	private Order order;
}
