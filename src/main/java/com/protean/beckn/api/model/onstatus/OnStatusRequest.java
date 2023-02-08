package com.protean.beckn.api.model.onstatus;

import com.protean.beckn.api.model.common.Context;
import com.protean.beckn.api.model.common.Error;

import lombok.Data;

@Data
public class OnStatusRequest {
	private Context context;
	private OnStatusMessage message;
	private Error error;
}