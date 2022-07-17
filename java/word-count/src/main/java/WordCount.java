import java.util.HashMap;
import java.util.Map;

public class WordCount {

    Map<String, Integer> phrase(String phrase) {
        Map<String, Integer> results = new HashMap<>(); //Map that will be returned
        phrase = phrase.toLowerCase(); //converting ecerything to lowercase
        
        phrase = phrase.replaceAll(",", " "); // replace commas with spaces

        phrase = phrase.replaceAll("\\p{Cc}", ""); // remove control characters

        phrase = phrase.replaceAll("[^a-zA-Z0-9\\s']", ""); //remove non alphanumeric characters except '

        phrase = phrase.trim().replaceAll("  +", " "); // remove all whitspace
        
        String[] words = phrase.split(" ");

        // String[] words = Pattern.compile("ian").split(phrase.replaceAll("[^\\p{Alnum}]+", ""));

        for (String word : words) {
            if (word.charAt(0) == '\'' && word.charAt(word.length() - 1) == '\'') {
                word = word.substring(1, word.length() - 1);
            }
            
            if (results.containsKey(word)) {
                int count = results.get(word);
                count++;
                results.remove(word);
                results.put(word, count);
            }
            else {
                results.put(word, 1);
            }
        }
        
        return results;
    }
}