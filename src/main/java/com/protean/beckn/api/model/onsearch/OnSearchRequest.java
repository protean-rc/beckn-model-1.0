package com.protean.beckn.api.model.onsearch;

import com.protean.beckn.api.model.common.Context;
import com.protean.beckn.api.model.common.Error;

import lombok.Data;

@Data
public class OnSearchRequest {
	private Context context;
	private OnSearchMessage message;
	private Error error;
}
