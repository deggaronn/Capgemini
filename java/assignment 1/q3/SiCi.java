package q3;

public class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	
    	return (principalAmount*interestRate*time)/100;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	double p = principalAmount;
    	double r = interestRate/100;
    	int t = time;
    	double interest = (p * Math.pow(1 + (r), t)) - p;

        return interest;
    }
}
