public class accessModifiers    {
    //public, protected, private
    //static, final


    // private var can only be accessed in the same class
    //public can be accessed by other files/classes
    //protected means that a different package/subclass can access it.
    //private -> default -> protected -> public
    //static doesnt need a class to be defined to use or grab the variable or method. with static you can just call the  object not the class.whatever
    //final means that the value can never change.
    public static void main (String[] args){

        Dog2 sugar = new Dog2();
        sugar.age = 4;
        sugar.name = "Sugar";
        sugar.woof();
        System.out.println(sugar.age);

        Dog2 MJ = new Dog2("MJ", 20);
        System.out.println(MJ.age);



    }
}
class Dog2{
    public String picture;
    public String name;
    public int age;
    //you can have multiple constructors
    //constructor 1
    public Dog2(){}
    //constructor 2
    public Dog2(String name, int age){
        this.age = age;
        this.name = name;


    }
    public void woof(){
        System.out.println("woof");
    }

}