/**
 * 
 */
package com.lti.exception;

/**
 * @author user242
 *
 */
public class MaxCourseReachedException extends Exception {
	private int count;

	public MaxCourseReachedException(int count) {
		this.count = count;
	}
	public String getMessage() {
		return "You have already registered for " + count + " courses";
	}
}
