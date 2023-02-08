package com.protean.beckn.api.model.common;

import java.util.List;

import lombok.Data;

@Data
public class Contact {
	private String name;
	private Address address;
	private String phone;
	private String email;
	private Object jcard;
	private List<TagData> tags;
}
