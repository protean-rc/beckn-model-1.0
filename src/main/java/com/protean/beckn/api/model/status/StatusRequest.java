package com.protean.beckn.api.model.status;

import javax.validation.Valid;
import com.protean.beckn.api.model.common.Context;

import lombok.Data;

@Data
public class StatusRequest {
	@Valid
	private Context context;
	private StatusMessage message;
}
