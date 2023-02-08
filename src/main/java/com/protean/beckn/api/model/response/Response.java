package com.protean.beckn.api.model.response;

import com.protean.beckn.api.model.common.Context;
import com.protean.beckn.api.model.common.Error;

import lombok.Data;

@Data
public class Response {
	private Context context;
	private ResponseMessage message;
	private Error error;
}
