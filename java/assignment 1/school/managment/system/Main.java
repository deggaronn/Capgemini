package school.managment.system;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher abhishek=new Teacher(1, "abhishek",500);
		Teacher bondwal = new Teacher(2,"bondwal",700);
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(abhishek);
		teacherList.add(bondwal);
		Student rahul=new Student(1,"rahul",4);
		Student tyagi=new Student(2,"tyagi",6);
		List<Student> studentList = new ArrayList<>();
		studentList.add(rahul);
		studentList.add(tyagi);
		School dps = new School(teacherList, studentList);
		
		rahul.payFees(500);

		tyagi.payFees(400);
		System.out.println(dps.getTotalMoneyEarned());
	}

}
