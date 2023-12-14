package com.protean.beckn.api.model.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MediaFile {

	private String mimetype;
	private String url;
	private String signature;
	private String dsa;
}
