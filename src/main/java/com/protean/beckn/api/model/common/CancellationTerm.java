package com.protean.beckn.api.model.common;

import lombok.Data;

@Data
public class CancellationTerm {

	private boolean refund_eligible;
	private boolean return_eligible;
	private boolean replacement_eligible;
	private State fulfillment_state;
	private Time cancel_by;
	private Fee cancellation_fee;
	private MediaFile external_ref;
}
