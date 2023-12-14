package com.protean.beckn.api.model.common;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Context {
	@NotBlank(message = "domain field is required")
	private String domain;

	private Location location;
	
	@NotBlank(message = "action field is required")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Invalid action name")
	private String action;
	
	@NotBlank(message = "version field is required")
	@Pattern(regexp = "^([0-9]+)(\\.([0-9]+))+", message = "Invalid version")
	@JsonProperty("version")
	private String version;
	
	@NotBlank(message = "bap_id field is required")
	@Pattern(regexp = "^[a-zA-Z0-9/:._-]+$", message = "Invalid bap_id")
	@JsonProperty("bap_id")
	private String bapId;
	
	@NotBlank(message = "bap_uri field is required")
	@Pattern(regexp = "^[a-zA-Z0-9/:._-]+$", message = "Invalid bap_uri")
	@JsonProperty("bap_uri")
	private String bapUri;
	
	@Pattern(regexp = "^[a-zA-Z0-9/:._-]+$", message = "Invalid bpp_id")
	@JsonProperty("bpp_id")
	private String bppId;
	
	@Pattern(regexp = "^[a-zA-Z0-9/:._-]+$", message = "Invalid bpp_uri")
	@JsonProperty("bpp_uri")
	private String bppUri;
	
	@NotBlank(message = "transaction_id field is required")
	@Pattern(regexp = "^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$", message = "Invalid transaction_id")
	@JsonProperty("transaction_id")
	private String transactionId;
	
	@NotBlank(message = "message_id field is required")
	@Pattern(regexp = "^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$", message = "Invalid message_id")
	@JsonProperty("message_id")
	private String messageId;
	
	@NotBlank(message = "timestamp field is required")
	@Pattern(regexp = "((?:[1-9][0-9]*)?[0-9]{4})-(1[0-2]|0[1-9])-(3[01]|0[1-9]|[12][0-9])T(2[0-3]|[01][0-9]):([0-5][0-9]):([0-5][0-9])(\\.[0-9]+)?(Z|[+-](?:2[0-3]|[01][0-9]):[0-5][0-9])?", 
		message = "Invalid timestamp")
	private String timestamp;
	
	private String key;
	
	@NotBlank(message = "ttl field is required")
	@Pattern(regexp = "^[Pp](?=\\d|[Tt]\\d)(?:(\\d+)[Yy])?(?:(\\d+)[Mm])?(?:(\\d+)([DWdw]))?(?:[Tt](?:(\\d+)[Hh])?(?:(\\d+)[Mm])?(?:(\\d+(?:\\.\\d+)?)[Ss])?)?$", message = "Invalid ttl")
	private String ttl;

}