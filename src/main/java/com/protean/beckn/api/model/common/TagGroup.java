package com.protean.beckn.api.model.common;

import java.util.List;

import lombok.Data;

@Data
public class TagGroup {
	private boolean display = true;
	private Descriptor descriptor;
	private List<Tag> list;
}
