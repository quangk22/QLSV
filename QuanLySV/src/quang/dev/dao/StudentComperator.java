package quang.dev.dao;

import java.util.Comparator;

import quang.dev.model.Student;


public class StudentComperator implements Comparator<Student>{

	@Override	
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getPoint() > o2.getPoint())
			return 1;
		if(o1.getPoint() < o2.getPoint())
			return -1;
		return 0;

	}

}
