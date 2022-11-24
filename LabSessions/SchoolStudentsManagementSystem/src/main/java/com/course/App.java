package com.course;

import com.dao.StudentDao;
import com.entity.Student;

public class App {
	public static void main(String[] args) {
		// Create student and course object

		Student s1 = new Student(1, "Ram Kumar", 7, "JCHSK");
		Student s2 = new Student(2, "Shyam Kumar", 6, "JCHSK");
		Student s3 = new Student(3, "Riya Krishnan", 8, "JCHSK");
		Student s4 = new Student(4, "Shweta Shah", 7, "JCHSK");

		// Create studentDao object
		StudentDao stdDao = new StudentDao();
		// Add student
		stdDao.saveStudent(s1);
		stdDao.saveStudent(s2);
		stdDao.saveStudent(s3);
		stdDao.saveStudent(s4);

		// Delete student
		// Student s = stdDao.deleteStudent(s2.getStdId());
		// System.out.println("Deleted Student : " + s.getFull_Name());

	}
}
