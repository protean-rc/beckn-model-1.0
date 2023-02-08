package com.protean.beckn.api.model.onupdate;

import com.protean.beckn.api.model.common.Context;

import lombok.Data;

@Data
public class OnUpdateRequest {
	private Context context;
	private OnUpdateMessage message;
}