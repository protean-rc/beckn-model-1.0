package com.protean.beckn.api.model.common;

import java.util.List;

import lombok.Data;

@Data
public class Person {
	private String id;
    private String name;
    private List<Image> image;
    private String dob;
    private String gender;
    private List<Credential> creds;
    private List<TagData> tags;
}
