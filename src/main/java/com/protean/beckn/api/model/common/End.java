package com.protean.beckn.api.model.common;

import lombok.Data;

@Data
public class End {
	private Location location;
    private Time time;
    private Descriptor instructions;
    private Contact contact;
    private Person person;
    private Authorization authorization;
}
