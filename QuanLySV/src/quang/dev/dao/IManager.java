package quang.dev.dao;

import java.util.List;

import quang.dev.model.Student;

public interface IManager {
	void add (Student student);
	void remove(String id);
	List<Student> all();
	void search(String id);
	void sort();
	
}
