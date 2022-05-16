class Scrabble {
    String word;

    Scrabble(String word) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        this.word = word.toUpperCase();
    }

    int getScore() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

        int score = 0;

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'L' || letter == 'N' || letter == 'R' || letter == 'S' || letter == 'T') {
                score += 1;
            }
            else if (letter == 'D' || letter == 'G') {
                score += 2;
            }
            else if (letter == 'B' || letter == 'C' || letter == 'M' || letter == 'P') {
                score += 3;
            }
            else if (letter == 'F' || letter == 'H' || letter == 'V' || letter == 'Y' || letter == 'W') {
                score += 4;
            }
            else if (letter == 'K') {
                score += 5;
            }
            else if (letter == 'J' || letter == 'X') {
                score += 8;
            }
            else {
                score += 10;
            }
        }

        return score;
    }

}
