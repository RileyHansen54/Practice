
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
public class assignment2{
    public static void main(String[] args){
//        String[] Questions = new String[3];
//        Questions[0] = "How many states in US?";
//        Questions[1] = "Capiltal of US?";
//        Questions[2] = "Symbol for Iron";
//        String[] Answers = new String[3];
//        Answers[0] = "50";
//        Answers[1] = "DC";
//        Answers[2] = "FE";
//
//    Scanner scan = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Question" + (i + 1) + "is: " + Questions[i]);
//            String ans = scan.next();
//
//            if (Objects.equals(ans, Answers[i])){
//                System.out.println("Correct! \n\n");
//            }
//            else{
//                System.out.println("False");
//                break;
//            }
//        }
    String[] QuestAns;
    QuestAns = Qa();
    Game(QuestAns);



    }


    public static String[] Qa(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many questions do you want?");
        String res = scan.nextLine();
        int num = Integer.parseInt(res);

        String[] QA = new String[(num * 2)];

        for (int i = 0; i < QA.length; i++) {
            System.out.println("\nQuestion_" + (i/2)+":");
            String res1 = scan.nextLine();
            QA[i] = res1;
            i++;
            System.out.println("\nAnswer_" + (i-1)/2+":");
            String res2 = scan.nextLine();
            QA[i] = res2;
        }
    return QA;
    }


    public static void Game(String[] QA){
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < QA.length; i++) {
            System.out.println("\nQuestion" + i+" is: " + QA[i]+" \nWhat is the correct answer?\n");
            String ans = scan.nextLine();
            i++;
            if (Objects.equals(ans, QA[i])){
                System.out.println("Correct! \n\n");
            }
            else{
                System.out.println("False");
            }

        }



    }


}