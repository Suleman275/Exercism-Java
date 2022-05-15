class Darts {
    double distance = 0;

    Darts(double x, double y) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        distance = Math.sqrt((x*x) + (y*y));
    }

    int score() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        if (distance > 10) {
            return 0;
        }
        else if (distance > 5) {
            return 1;
        }
        else if (distance > 1) {
            return 5;
        }
        else {
            return 10;
        }
    }

}
