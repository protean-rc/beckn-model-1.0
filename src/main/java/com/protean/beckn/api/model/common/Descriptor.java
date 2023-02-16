package com.protean.beckn.api.model.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Descriptor {
	
    private String code;
    private String name;
    
    @JsonProperty("short_desc")
    private String shortDesc;
    
    @JsonProperty("long_desc")
    private String longDesc;
    
    @JsonProperty("additional_desc")
    private AdditionalDesc additionalDesc;
    
    private List<MediaFile> media;
    
    private List<Image> images;
}
