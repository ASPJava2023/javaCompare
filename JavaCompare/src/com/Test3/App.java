package com.Test3;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(101, "Aam", 10000.00));
		al.add(new Student(106, "aam", 10000.00));
		al.add(new Student(105, "Jai", 15000.00));
		al.add(new Student(102, "Tom", 10100.00));
		al.add(new Student(103, "Zavi", 10500.00));
		al.add(new Student(104, "Mohan", 11000.00));

		for (Student student : al) {
			System.out.println(student);
		}
		System.out.println("############# By using Comparable###############");
		Collections.sort(al);
		
		for (Student student : al) {
			System.out.println(student);
		}
	}
}
