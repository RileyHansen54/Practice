import java.util.Scanner;

public class trycatch {
    public static void main (String[] args) throws TestException{

    try {
        Checknum();
    }catch (Exception e){
        System.out.println(e.getMessage());
    }finally {
        System.out.println("end");
    }


        }
   private static void Checknum() throws TestException{
       Scanner s = new Scanner(System.in);
       int i = s.nextInt();

        if (i == 0) {
            throw new TestException("The number is zero");
        }
    }
}
