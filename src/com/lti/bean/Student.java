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
public class Student extends User 
{
	private String department;
	private int studentId;
	private int gradYear;
	boolean isApproved;
	
	//Constructing User of a Student type.
	public Student(String userId, String name, RoleConstant role, String password, GenderConstant gender, String address,String branchName,int studentId,int batch,boolean isApproved) {
		super(userId, name, role, password,gender,address);
		this.department = branchName;
		this.studentId = studentId;
		this.gradYear = batch;
		this.isApproved = isApproved;
	}

	public Student() {
		
	}
	/**
	 * @return the department
	 */
	public String getDepartment() 
	{
		return department;
	}
	
	
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) 
	{
		this.department = department;
	}
	
	
	/**
	 * @return the studentID
	 */
	public int getStudentId() 
	{
		return studentId;
	}
	
	
	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentId(int studentId) 
	{
		this.studentId = studentId;
	}
	
	
	/**
	 * @return the gradYear
	 */
	public int getGradYear() 
	{
		return gradYear;
	}
	
	
	/**
	 * @param gradYear the gradYear to set
	 */
	public void setGradYear(int gradYear) 
	{
		this.gradYear = gradYear;
	}
		
	
}
