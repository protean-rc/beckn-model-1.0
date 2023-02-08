package com.protean.beckn.api.model.common;

import java.util.List;

import lombok.Data;

@Data
public class TagData {
	private String code;
	private String name;
	private List<TagDataList> list;
}
