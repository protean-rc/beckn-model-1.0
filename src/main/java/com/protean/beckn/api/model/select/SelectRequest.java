package com.protean.beckn.api.model.select;

import javax.validation.Valid;
import com.protean.beckn.api.model.common.Context;

import lombok.Data;

@Data
public class SelectRequest {
	@Valid
	private Context context;
	private SelectMessage message;
}
