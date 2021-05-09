package PILLARS;

public abstract class Employee {
    
    public String name;
    public int ID;

    //Constructor
    public Employee(String name, int ID)
    {
        this.name = name;
        this.ID = ID;
    }
    public void info()
    {
        System.out.println("Name: " + this.name + "\nID: " + this.ID);
    }
}