package com.protean.beckn.api.model.common;

import java.util.List;

import lombok.Data;

@Data
public class Descriptor {
	private String name;
    private String code;
    private String shortDesc;
    private String longDesc;
    private AdditionalDesc additionalDesc;
    private List<Image> images;
}
