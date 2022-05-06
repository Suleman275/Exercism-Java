
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getLastWeek() method");
        return birdsPerDay;
    }

    public int getToday() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getToday() method");
        if (birdsPerDay.length > 0) {
            return birdsPerDay[birdsPerDay.length-1];
        }
        else return 0;
    }

    public void incrementTodaysCount() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
        birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
        for (int day:birdsPerDay) {
            if (day == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
        int total = 0;

        for (int i = 0; i < numberOfDays; i++) {
            if (i < birdsPerDay.length) {
                total += birdsPerDay[i];
            }
        }
        return total;
    }

    public int getBusyDays() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
        int bDays = 0;

        for (int day:birdsPerDay) {
            if (day>=5){
                bDays++;
            }
        }
        return bDays;
    }
}
