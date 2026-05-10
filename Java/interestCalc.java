import java.util.Scanner;
public class interestCalc {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.println("Please enter the Principal amount ");
        float P = inp.nextFloat();
        System.out.println("Please enter the Interest Rate ");
        float R = inp.nextFloat();
        System.out.println("Please enter the Time Accrued ");
        float T = inp.nextFloat();

        System.out.println("\n\nYour simple interest is : " + (P * R * T));







    }
}
