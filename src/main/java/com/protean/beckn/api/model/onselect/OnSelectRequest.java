package com.protean.beckn.api.model.onselect;

import com.protean.beckn.api.model.common.Context;
import com.protean.beckn.api.model.common.Error;

import lombok.Data;

@Data
public class OnSelectRequest {
	private Context context;
	private OnSelectMessage message;
	private Error error;
}