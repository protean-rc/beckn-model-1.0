package com.protean.beckn.api.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Form {
	@JsonProperty("url")
	private String url;
	
	@JsonProperty("data")
	private Object data;
	
	@JsonProperty("mime_type")
	private String mimeType;
	
	@JsonProperty("submission_id")
	private String submissionId;	//UUID
}
