/**
 * 
 */
package com.lti.exception;

/**
 * @author user242
 *
 */
public class SeatNotAvailableException {
private int noOfSeats;
	
	public SeatNotAvailableException(int seat) {
		noOfSeats = seat;
	}
	


	/**
	 * @return the noOfSeats
	 */
	public int getNoOfSeats() {
		return noOfSeats;
	}


	/**
	 * Message returned when exception is thrown
	 */
	@Override
	public String getMessage() {
		return "The number of seats are already " + noOfSeats + ". Sorry!";
	}

}
