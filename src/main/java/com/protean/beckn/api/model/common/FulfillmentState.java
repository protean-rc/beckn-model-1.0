package com.protean.beckn.api.model.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FulfillmentState {

	private Descriptor descriptor;
	private String updated_at;
	private String updated_by;
	
}
