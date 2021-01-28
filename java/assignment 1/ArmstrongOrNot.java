
public class ArmstrongOrNot {
	public boolean armstrongCheck(int num) {
		int temp, sum=0, rem;
		temp=num;
		while(temp>0) {
			rem=temp%10;
			temp=temp/10;
			sum=sum+(rem*rem*rem);
		}
		if(sum==num) {
			return true;
		}
		else {
			return false;
		}
	}
	
}


