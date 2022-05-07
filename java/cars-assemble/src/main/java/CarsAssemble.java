public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        // throw new UnsupportedOperationException("Please implement the AssemblyLine.productionRateperHour() method");
        double rate = 0;
        if (speed == 10) {
            rate = 0.77;
        }
        else if (speed == 9) {
            rate = 0.8;
        }
        else if (speed <= 8 && speed >= 5) {
            rate = 0.9;
        }
        else if (speed <= 4 && speed >= 1) {
            rate = 1;
        }
        return speed * 221 * rate;
    }

    public int workingItemsPerMinute(int speed) {
        // throw new UnsupportedOperationException("Please implement the AssemblyLine.workingItemsPerMinute() method");
        return (int) productionRatePerHour(speed) / 60;
    }
}
