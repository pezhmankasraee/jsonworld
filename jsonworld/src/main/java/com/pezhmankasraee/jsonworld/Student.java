package com.pezhmankasraee.jsonworld;

public class Student {
	
	private String studentId;
	private String studentFullName;
	private String fieldOfStudy;
	/**
	 * @return the studentFullName
	 */
	public String getStudentFullName() {
		return studentFullName;
	}
	/**
	 * @param studentFullName the studentFullName to set
	 */
	public void setStudentFullName(String studentFullName) {
		this.studentFullName = studentFullName;
	}
	/**
	 * @return the fieldOfStudy
	 */
	public String getFieldOfStudy() {
		return fieldOfStudy;
	}
	/**
	 * @param fieldOfStudy the fieldOfStudy to set
	 */
	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}
	/**
	 * @return the studentId
	 */
	public String getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
}
