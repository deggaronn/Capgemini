package q2;

public class Assignment1Q2 {
    public static void main (String [] args) {

       int min = 100;int max = 999;
       
       ArmstrongNumBetweenRange myRange = new ArmstrongNumBetweenRange();
       
       for (int element: myRange.armstrongNumbersInRange(min,max)) {
           System.out.println(element);
       }

    }
}