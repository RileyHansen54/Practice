public abstract class Vehicle implements vehiclespecs{
    int wheels;
    int doors;
    String color;
//abstract means that the class wont have any objects but will be used by subclasses. "vehicles dont exist but cars do"
    public Vehicle(int wheels,int doors, String color){
        this.color = color;
        this.doors = doors;
        this.wheels = wheels;
    }

    public abstract void horn(); //since abstract all vehicles have a horn sound
}



class Prius extends Vehicle{
    public Prius(int wheels, int doors, String color) {
        super(wheels, doors, color);
    }

 @Override
    public void horn(){
        System.out.println("beep");
    }

    @Override
    public void drivetrain(){
        System.out.println("RWD");

    }


}