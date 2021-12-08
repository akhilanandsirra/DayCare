package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class ClassRoom {
private int capacity;
private Vector<Teacher> teacherRoster;
private Vector<Student> studentRoster;
public int getCapacity() {
	return capacity;
}

public void setCapacity(int capacity) {
	this.capacity = capacity;
}
public Vector<Teacher> getTeacher() {
	return teacherRoster;
}
public void setTeacher(Vector<Teacher> teacher) {
	this.teacherRoster = teacher;
}
public Vector<Teacher> getStudent() {
	return teacherRoster;
}
public void setStudent(Vector<Student> student) {
	this.studentRoster = student;
}

public ClassRoom(int capacity, Vector<Teacher> teacher, Vector<Student> student) {
	super();
	this.capacity = capacity;
	this.studentRoster= new Vector<Student>();
	this.teacherRoster=new Vector<Teacher>();
	
	
}

public void addStudent(Student std) {
	studentRoster.add(std);
}

public void addTeacher(Teacher tea) {
	teacherRoster.add(tea);
}

@Override
public String toString() {
	return "ClassRoom [capacity=" + capacity + ", teacher=" + teacherRoster + ", student=" + studentRoster + "]";
}
public ClassRoom() {
	// default constructor
	this.studentRoster= new Vector<Student>();
	this.teacherRoster=new Vector<Teacher>();
}

}