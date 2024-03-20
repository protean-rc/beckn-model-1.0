package com.protean.beckn.api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FulfillmentStatus {

	APPLICATION_STARTED("APPLICATION-STARTED", "Application Started"), 
	APPLICATION_IN_PROGRESS("APPLICATION-IN-PROGRESS", "Application In Progress"),
	APPLICATION_FILLED("APPLICATION-FILLED", "Application Filled"), 
	APPLICATION_SUBMITTED("APPLICATION-SUBMITTED", "Application Submitted"),
	APPLICATION_APPROVED("APPLICATION-APPROVED", "Application Approved"), 
	APPLICATION_REJECTED("APPLICATION-REJECTED", "Application Rejected"),
	AMOUNT_DISBURSED("AMOUNT-DISBURSED", "Amount Disbursed");

	private String code;
	private String name;

}