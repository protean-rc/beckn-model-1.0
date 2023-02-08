package com.protean.beckn.api.model.common;

import java.util.List;

import lombok.Data;

@Data
public class Fulfillment {
	private String id;
	private String type;
	private String provider_id;
	private State state;
	private Customer customer;
	private Agent agent;
	private Contact contact;
	private Start start;
	private End end;
	private List<TagData> tags;
}
