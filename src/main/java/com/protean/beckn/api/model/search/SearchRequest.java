package com.protean.beckn.api.model.search;

import javax.validation.Valid;
import com.protean.beckn.api.model.common.Context;

import lombok.Data;

@Data
public class SearchRequest {
	@Valid
	private Context context;
	private SearchMessage message;
}
