import java.util.*;

public class Collections {
    public static void main (String[] args){
        //Arraylist --- add entries dynamically
        System.out.println("Arraylist\n");

        List<String> questionList = new ArrayList<>();

        questionList.add("what langauge is spoken in germany");
        questionList.add("what langauge is spoken in USA");
        questionList.add("what langauge is spoken in China");

        questionList.remove(1);
        ; //length
        System.out.println(questionList.size());

        System.out.println(questionList.get(0));
        System.out.println(questionList.get(1));

        // <any datatype except primitive so we need wrapper classes>  <Integer>  not <int>.  <Character> not <char>
        List<List<String>> ListoLists = new ArrayList<>();


        //Maps --- maps a key to a value.
        System.out.println("\n\n\nMaps\n");

        Map<String, String> countryToCapital = new HashMap<>();

        countryToCapital.put("Germany","Berlin");
        countryToCapital.put("United States","DC");
        countryToCapital.put("UK","London");
        countryToCapital.put("Italy","Rome");


        System.out.println(countryToCapital.get("Germany"));


        //Sets  --- collection that contains no duplicates
        System.out.println("\n\n\nSets\n");

        Set<String> usernames = new HashSet<>();
        usernames.add("fastshot54");
        usernames.add("MLGCOOLGUY");
        usernames.add("Colguy96");
        usernames.add("Colguy96");
        usernames.add("Colguy96");
        usernames.add("Colguy96");




    }
}
