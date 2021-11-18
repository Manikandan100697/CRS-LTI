/**
 * 
 */
package com.lti.service;

import com.lti.bean.User;
import com.lti.constant.GenderConstant;
import com.lti.constant.RoleConstant;

/**
 * @author user242
 *
 */
public class UserRegImplementation implements UserRegInterface {
	User u1 = new User("R102", "Ram", RoleConstant.ADMIN, "bcomnd", GenderConstant.MALE, "Delhi"){};
	/* (non-Javadoc)
	 * @see com.lti.service.UserRegInterface#userRegistration()
	 */
	public void userRegistration() {
		// TODO Auto-generated method stub
		User u2 = new User("R103", "Rahul", RoleConstant.PROFESSOR, "bcbfd", GenderConstant.MALE, "Delhi"){};
	}

	public void updatePassword() {
		// TODO Auto-generated method stub
		String curPass = "sd";
		System.out.println("Please enter the current password: ");
		if (curPass == u1.getPassword()) {
			String password = "sdd";
			System.out.println("Please enter the new password: ");
			u1.setPassword(password);
		}
	}

}
