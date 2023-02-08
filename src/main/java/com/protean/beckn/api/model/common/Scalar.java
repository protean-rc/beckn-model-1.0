package com.protean.beckn.api.model.common;

import lombok.Data;

@Data
public class Scalar {
	private String type;
    private double value;
    private double estimatedValue;
    private double computedValue;
    private Range range;
    private String unit;
}
