package com.protean.beckn.api.model.update;

import com.protean.beckn.api.model.common.Context;

import lombok.Data;

@Data
public class UpdateRequest {
	private Context context;
	private UpdateMessage message;
}