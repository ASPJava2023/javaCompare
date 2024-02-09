package com.Test5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
		System.out.println("###########Using Lamda by salary #################");
		
		Comparator<Student> T=(Student e1,Student e2)->{
		//return e1.getId()-e2.getId();
			return (int) (e1.getSalary()-e2.getSalary());
		};
		
		Collections.sort(al, (o1, o2) ->T.compare(o1, o2) );
		//Collections.sort(al, new MysortByName());
		
		for (Student student : al) {
			System.out.println(student);
		}
	}
}
