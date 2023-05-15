package quang.dev.dao;

import java.util.List;
import java.util.Scanner;

import quang.dev.model.Student;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IManager manager = new Manager();
		showMenu(manager);
	}

	private static void showMenu(IManager manager) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("========Menu=============");
			System.out.println("   1.Thêm sinh viên");
			System.out.println("   2.Hiển thị danh sách");
			System.out.println("   3.Tìm kiếm");
			System.out.println("   4.Sắp xếp");
			System.out.println("   5.xóa ");
			System.out.println("   0.Thoát");
			System.out.println("=========================");
			System.out.println("Nhập lựa chọn :");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				manager.add(addStudent(sc));
				break;
			case 2:
				print(manager);
				break;
			case 3:
				manager.search(search(sc));
				break;
			case 4:
				manager.sort();
				sortPoint(manager);			
				break;
			case 5:
				System.out.println("Nhập id muốn xóa");
				String id = sc.next();
				manager.remove(id);
				break;

			case 0:
				System.out.println("Đã thoát");
				System.exit(0);
				break;

			default:
				System.out.println("Vui lòng nhập lại");
				break;
			}

		} while (choice != 5);

	}

	
	private static void sortPoint(IManager manager) {
		// TODO Auto-generated method stub
		List<Student> sortStudent = manager.all();
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Mã", "Tên", "Tuổi", "Địa chỉ", "Điểm");
		for (Student student : sortStudent) {
			System.out.println(student.toString());
		}
	}

	private static void print(IManager manager) {
		// TODO Auto-generated method stub
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Mã", "Tên", "Tuổi", "Địa chỉ", "Điểm");
		for (Student student : manager.all()) {
			System.out.printf("%-10s%-10s%-10d%-10s%-10.1f\n", student.getId(), student.getName(), student.getAge(),
					student.getAddress(), student.getPoint());
		}
	}

	private static String search(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Nhập mã sinh viên cần tìm");
		String id = sc.next();
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Mã", "Tên", "Tuổi", "Địa chỉ", "Điểm");
		return id;
	}

	private static Student addStudent(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("----Nhập thông tin----");
		System.out.println("Nhập tên :");
		String name = sc.next();

		System.out.println("Nhập tuổi :");
		int age = sc.nextInt();
		System.out.println("Nhập mã sinh viên :");
		String id = sc.next();
		System.out.println("Nhập địa chỉ : ");
		String address = sc.next();
		System.out.println("Nhập điểm TB :");
		Double point = sc.nextDouble();
		System.out.println("Đã thêm ");
		return new Student(name, age, id, address, point);
	}

}
