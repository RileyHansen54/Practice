
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] Lastweek = new int[7];
        int index = birdsPerDay.length-15;
        for (int i = 0; i < 7 ; i++) {
            Lastweek[i] = birdsPerDay[index +i];

        }
        return Lastweek;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length-1] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < this.birdsPerDay.length; i++) {
            if (this.birdsPerDay[i] == 0)
                return true;
        }
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        for (int i = 0; i <= numberOfDays; i++) {
            total += this.birdsPerDay[i];

        }
        return total;
    }

    public int getBusyDays() {
        throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
    }
}
