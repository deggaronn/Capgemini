package school.managment.system;

public class Student {
	//this class is used to manage the students and their fees
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/**
	 * 
	 * @param id
	 * @param name
	 * @param grade
	 */
	public Student(int id, String name, int grade) {
		this.feesPaid=0;
		this.feesTotal=30000;
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public void payFees(int fees) {
		feesPaid+=fees;
		School.updateTotalMoneyEarned(feesPaid);
	}
	public int getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public int getFeesPaid() {
		return feesPaid;
	}
	public int getFeesTotal() {
		return feesTotal;
	}
	public int getRemainingFees() {
		return feesTotal-feesPaid;
	}

}
