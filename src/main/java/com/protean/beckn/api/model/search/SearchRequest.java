package com.protean.beckn.api.model.search;

import com.protean.beckn.api.model.common.Context;
import com.protean.beckn.api.model.common.Error;

import lombok.Data;

@Data
public class SearchRequest {
	private Context context;
	private SearchMessage message;
	//private Error error;
}
