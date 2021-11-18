package com.lti.service;

import com.lti.bean.Course;
import com.lti.bean.Student;

public interface AdminInterface {
	public void isCourseAvailable(Course c);
	public void addProfessor();
	
	public void studentCoursesNotification(Course c, Student s);
}
