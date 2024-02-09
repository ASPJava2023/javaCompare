package com.Test6;

import java.util.Comparator;

public class MyCustomAssendingSort implements Comparator<Student>{

	@Override
	public int compare(Student e1, Student e2) {
		// TODO Auto-generated method stub
		if(e1.getId()>e2.getId()) {
		return -1;
		
		}else if(e1.getId()<e2.getId()){
		return 1;	
		
		}else {
			return 0;
		}
	}	
}
