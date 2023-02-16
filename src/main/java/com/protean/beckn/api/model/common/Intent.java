package com.protean.beckn.api.model.common;

import java.util.List;

import lombok.Data;

@Data
public class Intent {
	private Descriptor descriptor;
	private Provider provider;
	private Fulfillment fulfillment;
	private Payment payment;
	private Category category;
	private Offer offer;
	private Item item;
	private List<TagGroup> tags;

}
