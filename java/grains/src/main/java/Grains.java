import java.math.BigDecimal;
import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

        BigInteger result = new BigInteger("1");

        if(square > 0 && square < 65) {
            for(int i = 1; i < square; i++) {
                result = result.multiply(new BigInteger("2"));
            }
        }
        else {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }

        return result;
    }

    BigInteger grainsOnBoard() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

        BigInteger result = new BigInteger("0");

        for(int i = 1; i <= 64; i++) {
            result = result.add(grainsOnSquare(i));
        }

        return result;
    }

}
