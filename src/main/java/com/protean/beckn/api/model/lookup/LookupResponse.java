package com.protean.beckn.api.model.lookup;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class LookupResponse implements Serializable {

	private static final long serialVersionUID = 8260095980978686681L;
	
	@JsonProperty("subscriber_id")
	private String subscriberId;
	
	private String country;
	private String city;
	private String domain;
	
	@JsonProperty("signing_public_key")
	private String signingPublicKey;
	
	@JsonProperty("encr_public_key")
	private String encrPublicKey;
	
	@JsonProperty("valid_from")
	private String validFrom;
	
	@JsonProperty("valid_until")
	private String validUntil;
	
	private String created;
	private String updated;

	// below fields are from older version
	private String type;
	
	@JsonProperty("subscriber_url")
	private String subscriberUrl;
	
	@JsonProperty("br_id")
	private String brId;
	
	private String status;
	
	@JsonProperty("unique_key_id")
	private String uniqueKeyId;

}

