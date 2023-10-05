package com.protean.beckn.api.model.common;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Image {
	private String url;
	private String size_type; //Enum [xs, sm, md, lg, xl, custom]
	private String width;
	private String height;
}
