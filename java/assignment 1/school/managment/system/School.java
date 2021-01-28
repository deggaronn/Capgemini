package school.managment.system;

import java.util.*;

public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers=teachers;
		this.students=students;
		updateTotalMoneyEarned(0);
		updateTotalMoneySpent(0);
	}

	public List<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	public void updateTotalMoneySpent(int MoneySpent) {
		totalMoneySpent -= MoneySpent;
	}

	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += totalMoneyEarned;
	}
}
