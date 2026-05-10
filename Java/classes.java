public class classes {
    public static void main (String[] args){

        Dog sugar = new Dog();

        sugar.age = 4;
        sugar.name = "Sugar";
        sugar.woof();
        System.out.println(sugar.age);

        Dog MJ = new Dog("MJ", 20);
        System.out.println(MJ.age);



    }
}

class Dog{
    public String picture;
    public String name;
    public int age;
    //you can have multiple constructors
    //constructor 1
    public Dog(){}
    //constructor 2
    public Dog(String name, int age){
        this.age = age;
        this.name = name;


    }
    public void woof(){
        System.out.println("woof");
    }

}