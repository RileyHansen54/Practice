public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        switch(speed){
            case(speed<=4)
                return (speed * 221);
            case(speed<=8)
                return (speed * 221)*.9;
            case(speed<=9)
                return (speed * 221)*.8;
            case(speed<=10)
                return (speed * 221)*.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed)/60;

    }
}
