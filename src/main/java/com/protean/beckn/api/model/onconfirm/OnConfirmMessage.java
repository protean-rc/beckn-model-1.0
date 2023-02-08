package com.protean.beckn.api.model.onconfirm;

import com.protean.beckn.api.model.common.Order;

import lombok.Data;

@Data
public class OnConfirmMessage {
	private Order order;
}
