package com.protean.beckn.api.model.init;

import com.protean.beckn.api.model.common.Context;

import lombok.Data;

@Data
public class InitRequest {
	private Context context;
	private InitMessage message;
}
