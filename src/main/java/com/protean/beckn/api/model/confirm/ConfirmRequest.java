package com.protean.beckn.api.model.confirm;

import javax.validation.Valid;
import com.protean.beckn.api.model.common.Context;

import lombok.Data;

@Data
public class ConfirmRequest {
	@Valid
	private Context context;
	private ConfirmMessage message;
}
