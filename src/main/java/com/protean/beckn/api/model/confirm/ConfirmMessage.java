package com.protean.beckn.api.model.confirm;

import com.protean.beckn.api.model.common.Order;

import lombok.Data;

@Data
public class ConfirmMessage {
	private Order order;
}
