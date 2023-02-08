package com.protean.beckn.api.model.common;

import lombok.Data;

@Data
public class Address {
	private String full;	//Full unformatted address of a location.
	private String format;	//Defines the address formatting standard

}
