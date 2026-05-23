public class JedliksToyCar {

    private int mileage = 0;
    private int battery= 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.mileage+" meters";
    }

    public String batteryDisplay() {
        return "Battery at " + this.battery+"%";
    }

    public void drive() {
        if (battery >0) {
            this.mileage += 20;
            this.battery -= 1;
        }
        else
            System.out.println("Battery empty");

    }
}
