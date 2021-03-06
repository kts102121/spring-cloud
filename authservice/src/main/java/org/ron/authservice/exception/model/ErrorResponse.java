package org.ron.authservice.exception.model;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Getter
public class ErrorResponse {
	// General Error message
	private final String message;

	private final Date timestamp;

	public ErrorResponse(final String message) {
		this.message = message;
		this.timestamp = new Date();
	}
}