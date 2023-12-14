package com.protean.beckn.api.model.init;

import javax.validation.Valid;
import com.protean.beckn.api.model.common.Context;

import lombok.Data;

@Data
public class InitRequest {
	@Valid
	private Context context;
	private InitMessage message;
}
