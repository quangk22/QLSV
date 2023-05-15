package quang.dev.dao;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

import quang.dev.model.Student;

public class Manager implements IManager {
	List<Student> studentList = new ArrayList<>();

	@Override
	public void add(Student student) {
		// TODO Auto-generated method stub
		studentList.add(student);
	}

	@Override
	public void remove(String id) {
		// TODO Auto-generated method stub
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId().equals(id)) {
				studentList.remove(i);
				System.out.println("Đã xóa sinh viên có mã " + id);
			//	return; // thoát khỏi vòng lặp khi xóa thành công
			}else {
				System.out.println("Không tìm thấy sinh viên có mã " + id);
				
			}
		}
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub

		Collections.sort(studentList, new StudentComperator());
	}

	@Override
	public List<Student> all() {
		// TODO Auto-generated method stub
		return studentList;
	}

	@Override
	public void search(String id) {
		// TODO Auto-generated method stub
		for (Student student : studentList) {
			if (student.getId().equals(id)) {
				System.out.println(student.toString());
//				return; // tìm thấy sinh viên có mã id, thoát khỏi vòng lặp
			}
		}
		System.out.println("Không tìm thấy sinh viên có mã " + id);
	}

}
