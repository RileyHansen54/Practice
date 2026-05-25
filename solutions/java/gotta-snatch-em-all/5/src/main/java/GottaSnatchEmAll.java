import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> s = new HashSet<>();
        for (String card : cards){
            s.add(card);
        }

        return s;

    }

    static boolean addCard(String card, Set<String> collection) {
        boolean x = !collection.contains(card);
        collection.add(card);
        return x;
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean x = !(myCollection.containsAll(theirCollection) || theirCollection.containsAll(myCollection));
        return x;

    }

    static Set<String> commonCards(List<Set<String>> collections) {
        int i = 0;
        Set<String> s = new HashSet<>();
            for (String card: collections.get(i)){
                while(collections.get(i).contains(card))
                    i++;
                    if (i == collections.size() - 1){
                        s.add(card);
                        i = 0;
                        break;
                    }
            }

            return s;

    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> s = new HashSet<>();
        for (Set<String> Deck : collections){
            for (String card : Deck){
                s.add(card);
            }
        }
        return s;
    }
}
