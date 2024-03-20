package com.protean.beckn.api.model.common;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Fulfillment {
	private String id;
	private String type;
	private FulfillmentState state;
	private boolean tracking;
	private Customer customer;
	private Agent agent;
	private Contact contact;
	private List<Stop> stops;
	private String path;
	private List<TagGroup> tags;
}
