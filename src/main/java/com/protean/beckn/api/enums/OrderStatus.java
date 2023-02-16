package com.protean.beckn.api.enums;

public enum OrderStatus {

	ACTIVE("ACTIVE"),
	COMPLETE("COMPLETE"),
	CANCELLED("CANCELLED");
	
	private final String value;

	OrderStatus(String value) {
		this.value = value;
	}

	public String value() {
		return this.value;
	}
}