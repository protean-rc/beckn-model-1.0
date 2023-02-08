package com.protean.beckn.api.model.confirm;

import com.protean.beckn.api.model.common.Context;

import lombok.Data;

@Data
public class ConfirmRequest {
	private Context context;
	private ConfirmMessage message;
}
