package com.protean.beckn.api.model.common;

import com.protean.beckn.api.enums.AckStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ack {
	private AckStatus status;
}