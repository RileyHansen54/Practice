import java.util.Scanner;

public static void main(String[] args){
    String Q1 = "What color is the sky?";
    String A1 = "Blue";
    String Q2 = "What year is it?";
    String A2 = "2026";
    Scanner s = new Scanner(System.in);

    System.out.println(Q1);

    String input = s.next();
    if (Objects.equals(input, A1)){
        System.out.println("correct");
    }
    else{System.out.println("Wrong");}












}