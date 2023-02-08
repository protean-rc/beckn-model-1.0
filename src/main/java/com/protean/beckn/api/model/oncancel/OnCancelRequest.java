package com.protean.beckn.api.model.oncancel;

import com.protean.beckn.api.model.common.Context;

import lombok.Data;

@Data
public class OnCancelRequest {
	private Context context;
	private OnCancelMessage message;
}