package com.protean.beckn.api.model.oninit;

import com.protean.beckn.api.model.common.Context;
import com.protean.beckn.api.model.common.Error;

import lombok.Data;

@Data
public class OnInitRequest {
	private Context context;
	private OnInitMessage message;
	private Error error;
}