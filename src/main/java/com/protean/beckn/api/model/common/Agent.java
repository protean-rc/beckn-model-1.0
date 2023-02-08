package com.protean.beckn.api.model.common;

import lombok.Data;

@Data
public class Agent {
	private Person person;
    private Contact contact;
    private Organization organization;
}
