package com.protean.beckn.api.model.onconfirm;

import com.protean.beckn.api.model.common.Context;
import com.protean.beckn.api.model.common.Error;

import lombok.Data;

@Data
public class OnConfirmRequest {
	private Context context;
	private OnConfirmMessage message;
	private Error error;
}
