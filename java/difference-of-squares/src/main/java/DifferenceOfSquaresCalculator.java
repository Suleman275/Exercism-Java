class DifferenceOfSquaresCalculator {
    int squareOfSum = 0;
    int sumOfSquare = 0;

    int computeSquareOfSumTo(int input) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        for (int i = 1; i <= input; i ++) {
            squareOfSum += i;
        }
        return squareOfSum*squareOfSum;
    }

    int computeSumOfSquaresTo(int input) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        for (int i = 1; i <= input; i ++) {
            sumOfSquare += i*i;
        }
        return sumOfSquare;
    }

    int computeDifferenceOfSquares(int input) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
