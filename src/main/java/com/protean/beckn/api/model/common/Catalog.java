package com.protean.beckn.api.model.common;

import java.util.List;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Catalog {
	@JsonProperty("descriptor")
	private Descriptor bppDescriptor;

	/*@JsonProperty("categories")
	private Set<Category> bppCategories;*/

	@JsonProperty("fulfillments")
	private List<Fulfillment> bppFulfillments;

	@JsonProperty("payments")
	private List<Payment> bppPayments;
	
	@JsonProperty("offers")
	private List<Offer> bppOffers;

	@JsonProperty("providers")
	private List<Provider> bppProviders;

	private String exp;
	
	private String ttl;
}
