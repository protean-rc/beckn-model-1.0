package com.protean.beckn.api.model.common;

import java.util.List;

import lombok.Data;

@Data
public class Order {
	private String id;
	private List<String> refOrderIds;
	private Provider provider;
	private List<Item> items;
	private List<AddOn> addOns;
	private List<Offer> offers;
	private List<Document> documents;
	private Billing billing;
	private List<Fulfillment> fulfillments;
	private Cancellation cancellation;
	private List<CancellationTerm> cancellationTerms;
	private Quotation quote;
	private List<Payment> payments;
	private String createdAt;
	private String updatedAt;
}
