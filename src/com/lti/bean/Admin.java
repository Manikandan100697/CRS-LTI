/**
 * 
 */
package com.lti.bean;
import com.lti.constant.GenderConstant;
import com.lti.constant.RoleConstant;

/**
 * @author user242
 *
 */


public class Admin extends User
{
		
		private String adminID;
	
		/**
		 * @return the adminID
		 */
		public String getAdminID() {
			return adminID;
		}

		/**
		 * @param adminID the adminID to set
		 */
		public void setAdminID(String adminID) {
			this.adminID = adminID;
		}

		public Admin(String userID, String name, GenderConstant gender, RoleConstant role, String password, String address) 
		{
			super(userID, name, role, password, gender, address);
		}	

		
		
}
