package org.student;

import org.department.Department;

public class Student extends Department{
	public void StudentName()
	{
		System.out.println("The Name of the Student is : Nandhakumar");
	}
	public void StudentDept()
	{
		System.out.println("The Name of the Department is : BCA");
	}
	public void StudentId()
	{
		System.out.println("The Id of the Student is : 258963");
	}
	public static void main(String[] args) {
		Student s1= new Student();
		s1.CollegeName();
		s1.CollegeCode();
		s1.CollegeRank();
		s1.DeptName();
		s1.StudentName();
		s1.StudentDept();
		s1.StudentId();
	}
}
