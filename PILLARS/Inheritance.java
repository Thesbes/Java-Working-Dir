package PILLARS;

//Types of cars inherit from car class and build on them
class Car{
    public String model;
    public int year;
    public int speed;

    //Constructor 
    public Car(int year, String model, int speed){
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    //Car methods
    public void brake(int decrement)
    {
        speed -= decrement;
    }
    public void gas(int increment)
    {
        speed += increment;
    }
    public String info()
    {
        return ("\nYear: " + year
                            + "\nModel : " + model
                            + "\nSpeed : " + speed + "\n");
    }
}

//Truck builds on car but can carry a load
class Truck extends Car{
    int load;
    //Truck constructor inherits car characteristics and extends with car load;
    public Truck(int year, String model, int speed, int startLoad)
    {
        super(year, model, speed);
        load = startLoad;
    }

    //Truck adds 2 new methods
    public void addLoad(int increment)
    {
        load += increment;
    }
    public void unload(int decrement)
    {
        load -= decrement;
    }
    //Override info method for new info
    public String info()
    {
        return(super.info() + "Load: " + load + "\n");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Truck f150 = new Truck(2012, "F150",60,200);
        f150.addLoad(3);
        System.out.println(f150.info());
    }
}
