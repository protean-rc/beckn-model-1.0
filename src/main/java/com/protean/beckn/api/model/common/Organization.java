package com.protean.beckn.api.model.common;

import lombok.Data;

@Data
public class Organization {
	private Descriptor descriptor;
    private Address address;
    private Contact contact;
}
