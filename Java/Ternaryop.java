import java.util.Scanner;
public class Ternaryop {
    public static void main (String[] args){
        int totalchips = 55;
        System.out.println("There are 55 chips currently. How many chips did lara eat");
        Scanner s = new Scanner(System.in);
        int laraate = s.nextInt();

        totalchips = laraate >=1 ? 0:totalchips;

        System.out.println("there are " +totalchips +" Chips left");

    }
}
