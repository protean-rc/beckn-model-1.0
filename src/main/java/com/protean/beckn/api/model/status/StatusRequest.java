package com.protean.beckn.api.model.status;

import com.protean.beckn.api.model.common.Context;

import lombok.Data;

@Data
public class StatusRequest {
	private Context context;
	private StatusMessage message;
}
