package com.lti.exception;

public class MaxStudentsEnrolledException {
	private int count;

	public MaxStudentsEnrolledException(int count) {
		this.count = count;
	}
	public String getMessage() {
		return "the count allready reached " + count ;
	}
}
