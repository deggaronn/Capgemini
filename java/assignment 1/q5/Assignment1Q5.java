package q5;
import java.util.Scanner;

public class Assignment1Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Scanner scan = new Scanner(System.in);
    	int ctc = scan.nextInt();
    	TaxAmount tax = new TaxAmount();
    	System.out.println(tax.calculateTaxAmount(ctc));
    	scan.close();
	}

}
