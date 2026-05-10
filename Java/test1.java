import java.util.Scanner;
public class test1 {
    public static void main(String[] args){
    int knob;
    Scanner scan = new Scanner(System.in);
    knob = scan.nextInt();
    while (knob <1 || knob >3){
        System.out.println("Try again. 1-3");
        knob  = scan.nextInt();
        }

    switch (knob){
        case 1: System.out.println("red"); break;
        case 2: System.out.println("blue"); break;
        case 3: System.out.println("green"); break;

    }




    }



}
