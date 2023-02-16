package com.protean.beckn.api.model.common;

import lombok.Data;

@Data
public class QuotationBreakUp {
	private Item item;
	private String title;
	private Price price;
}
