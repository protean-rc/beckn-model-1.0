package com.protean.beckn.api.model.common;

import lombok.Data;

@Data
public class Credential {
	private String id;
	private String type = "VerifiableCredential";
	private String issuer;
	private String issuance_date;
    private CredentialSubject credential_subject;
    private CredentialSchema credential_schema;
}
