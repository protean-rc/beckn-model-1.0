package com.protean.beckn.api.model.response;

import com.protean.beckn.api.model.common.Ack;

import lombok.Data;

@Data
public class ResponseMessage {
	private Ack ack;
}
