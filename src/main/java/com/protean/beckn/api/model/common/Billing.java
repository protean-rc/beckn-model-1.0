package com.protean.beckn.api.model.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Billing {
	private String name;
	private Organization organization;
	private String address;
	private State state;
	private City city;
	private String email;
	private String phone;
	private Time time;
	private String tax_id;
}
