package q5;

public class TaxAmount {
    public double calculateTaxAmount(int ctc){
    	double slab = 0;
    	if(ctc<=180000) {
    		slab = 0;  //A
    	}else if(ctc >=180001 && ctc <= 300000){
    		slab = 0.1;  //B
    	}else if(ctc>=300001 && ctc<=500000) {
    		slab = 0.2; //C
    	}else if(ctc>=500001 && ctc<=1000000) {
    		slab = 0.3; //C
    	}
    	
    	double tax = ctc*slab;
    	
    	return tax;
    }
}
