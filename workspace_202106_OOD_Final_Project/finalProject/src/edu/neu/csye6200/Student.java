package edu.neu.csye6200;

import java.util.Scanner;

public class Student extends Person{

	private int grade;
	
	

	
	public Student(int age, String name, String first_Name, String last_name, String date, String gender, int grade) {
		super(age, name, first_Name, last_name, date, gender);
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}


	public static Student createStudentFromCSV(String std) {
		Scanner sn = new Scanner(std);
		sn.useDelimiter(",");
		Student st = new Student(sn.nextInt(), sn.next(),std, std, std, std, sn.nextInt());
		sn.close();
		return st;
	}
}
