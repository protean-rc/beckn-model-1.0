package com.protean.beckn.api.model.common;

import lombok.Data;

@Data
public class Cancellation {
	
	private String time;
	private Person cancelled_by;
	private Option reason;
	private Descriptor additional_description;
}
