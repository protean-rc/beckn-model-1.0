package com.protean.beckn.api.model.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Item {
	private String id;
	private String parentItemId;
    private Descriptor descriptor;
    private Price price;
    private String categoryId;
    private String fulfillmentId;
    private String locationId;
    private String paymentId;
    @JsonProperty("xinput_required")
    private XInputRequired xinputRequired;
    private Time time; 
    private boolean matched;
    private boolean related;
    private boolean recommended;
    private List<TagData> tags;
}
