package com.protean.beckn.api.model.common;

import lombok.Data;

@Data
public class Error {
	private String code;
	private String path;
	private String message;
}
