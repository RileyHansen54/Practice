
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age;

        age = 5;

        double age2 = age;

        int age3 = (int) age2;

        System.out.println(age3);

        System.out.println("Enter three fruits, and their associated calories please");
        Scanner newscan = new Scanner(System.in);

        String a = newscan.nextLine();
        System.out.println("And how many calories?");
        int a1 = newscan.nextInt();
        newscan.nextLine();
        System.out.println("Next Fruit Please");

        String b = newscan.nextLine();
        System.out.println("And how many calories?");
        int b1 = newscan.nextInt();
        newscan.nextLine();
        System.out.println("Next Fruit Please");

        String c = newscan.nextLine();
        System.out.println("And how many calories?");
        int c1 = newscan.nextInt();



        newscan.close();
        System.out.println("Hi, the total calories are " +(a1+b1+c1) +" \n");

    }
}