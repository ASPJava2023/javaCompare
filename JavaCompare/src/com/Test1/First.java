package com.Test1;

import java.util.ArrayList;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(120);
		al.add(34);
		al.add(240);
		al.add(50);

		System.out.println("Before sorting "+al);
		al.sort(null);
		System.out.println("After sorting "+al);

	}

}
