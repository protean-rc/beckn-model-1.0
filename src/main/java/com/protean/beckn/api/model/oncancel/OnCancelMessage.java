package com.protean.beckn.api.model.oncancel;

import com.protean.beckn.api.model.common.Order;

import lombok.Data;

@Data
public class OnCancelMessage {
	private Order order;
}
