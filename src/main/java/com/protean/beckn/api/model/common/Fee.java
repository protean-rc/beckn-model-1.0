package com.protean.beckn.api.model.common;

import lombok.Data;

@Data
public class Fee {
	
	private String percentage;
	private Price amount;
}
