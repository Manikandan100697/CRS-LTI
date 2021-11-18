/**
 * 
 */
package com.lti.service;

import com.lti.bean.Course;

/**
 * @author user242
 *
 */
public interface ProfessorInterface {
	public void professorLogin();
	public void assignMarksPerCourse();
	public void createCourse(Course c);
	public void studentDetailsForProfessor();
}
