package com.protean.beckn.api.model.lookup;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LookupRequest {
	@JsonProperty("subscriber_id")
	private String subscriberId;
	//private String country;
	//private String city;
	private String domain;
	private String type;
}
