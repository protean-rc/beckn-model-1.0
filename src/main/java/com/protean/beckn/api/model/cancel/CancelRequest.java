package com.protean.beckn.api.model.cancel;

import com.protean.beckn.api.model.common.Context;

import lombok.Data;

@Data
public class CancelRequest {
	private Context context;
	private CancelMessage message;
}
