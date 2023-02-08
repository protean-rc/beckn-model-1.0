package com.protean.beckn.api.model.cancel;

import com.protean.beckn.api.model.common.Descriptor;

import lombok.Data;

@Data
public class CancelMessage {
	private String orderId;
	private String cancellationReasonId;
	private Descriptor descriptor;
}