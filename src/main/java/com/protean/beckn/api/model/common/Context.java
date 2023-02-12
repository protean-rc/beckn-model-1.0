package com.protean.beckn.api.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Context {
	private String domain;
	//private String country;
	//private String city;
	private ContextLocation location;
	
	private String action;
	
	@JsonProperty("core_version")
	private String coreVersion;
	
	@JsonProperty("bap_id")
	private String bapId;
	
	@JsonProperty("bap_uri")
	private String bapUri;
	
	@JsonProperty("bpp_id")
	private String bppId;
	
	@JsonProperty("bpp_uri")
	private String bppUri;
	
	@JsonProperty("transaction_id")
	private String transactionId;
	
	@JsonProperty("message_id")
	private String messageId;
	
	private String timestamp;
	private String key;
	private String ttl;

    /*
     * required:
      - domain
      - action
      - country
      - city
      - core_version
      - transaction_id
      - message_id
      - bap_id
      - bap_uri
      - timestamp 
     */
}