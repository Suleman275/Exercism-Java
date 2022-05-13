class IsogramChecker {

    boolean isIsogram(String phrase) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

        for (int i = 0; i < phrase.length(); i++) {
            char l = phrase.charAt(i);
            Character letter = Character.toUpperCase(l);
            if (letter == '-' || letter == ' ') {
               continue;
            }
            for (int j = 0; j < phrase.length(); j++) {
               if (i == j) {
                  continue;
               }
               if (phrase.charAt(j) == '-' || phrase.charAt(j) == ' ') {
                  continue;
               }
               if (letter == Character.toUpperCase(phrase.charAt(j))) {
                  return false;
               }
            }
         }
        
        return true;
    }
}
