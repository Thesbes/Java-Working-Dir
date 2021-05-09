package PILLARS;

public class Salary extends Employee {
    
    double salary;

    public Salary(String name, int ID, double salary)
    {
        super(name,ID);
        this.salary = salary;
    }

    public void newSalary(double newSalary)
    {
        if(newSalary > 0.0)
            salary = newSalary;
        else
            System.out.print("Invalid salary");
    }
    public double getSalary()
    {
        return salary;
    }

    public String getName()
    {
        return name;
    }

    public void weeklyPay()
    {
        System.out.println("Weekly pay for "
         + getName() + ": " + salary/52);
    }

    public int getID()
    {
        return ID;
    }
    public void info()
    {
        System.out.println("\nName:  " + name 
                         + "\nID:     " + ID
                         + "\nSalary: " + salary + "\n");
    }
}
