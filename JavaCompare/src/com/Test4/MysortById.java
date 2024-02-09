package com.Test4;

import java.util.Comparator;

public class MysortById implements Comparator<Student>{

	@Override
	public int compare(Student e1, Student e2) {
		// TODO Auto-generated method stub
		return e1.getId()-e2.getId();
	}
}
