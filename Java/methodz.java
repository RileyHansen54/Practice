public class methodz {
    public static void main(String[] args) {
        String[] questions = new String[2];
        String[] answers = new String[2];

        questions[0] = "what is the start in the sky";
        answers[0] = "the sun";

        questions[1] = "what is a celestial object that light cant even escape";
        answers[1] = "a black hole!";

        qa(questions, answers);
    }


    public static void qa(String[] q, String[] a) {
        if (q.length == a.length) {
            for (int i = 0; i < q.length; i++) {
                System.out.println(q[i] + "\nthe answer is\n" + a[i]);
            }
        }
    }
}