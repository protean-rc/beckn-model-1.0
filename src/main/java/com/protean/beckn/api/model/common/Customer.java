package com.protean.beckn.api.model.common;

import lombok.Data;

@Data
public class Customer {
	private Person person;
	private Contact contact;
}
