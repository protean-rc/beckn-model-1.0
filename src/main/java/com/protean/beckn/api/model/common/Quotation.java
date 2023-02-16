package com.protean.beckn.api.model.common;

import java.util.List;

import lombok.Data;

@Data
public class Quotation {
	private String id; //UUID
	private Price price;
	private List<QuotationBreakUp> breakup;
	private String ttl;
}
