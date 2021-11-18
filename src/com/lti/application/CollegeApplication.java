/**
 * 
 */
package com.lti.application;

import com.lti.bean.Course;
import com.lti.service.AdminImplementation;
import com.lti.service.AdminInterface;
import com.lti.service.BillingImplementation;
import com.lti.service.BillingInterface;
import com.lti.service.ProfessorImplementation;
import com.lti.service.ProfessorInterface;

/**
 * @author user242
 *
 */
public class CollegeApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Courses c1 = new Courses();
		
		AdminInterface adminOperation = new AdminImplementation();
		ProfessorInterface professorOperation = new ProfessorImplementation();
		
//		professorOperation.createCourse(c1);
//		adminOperation.courseValidityCheck(c1);
//		adminOperation.studentCoursesNotification(c1);
		
		BillingInterface billing = new BillingImplementation();
		billing.payment();
	}

}
