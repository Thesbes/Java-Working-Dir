package PILLARS;
public class EmployeeParkingSpot extends Employee{
    
    int parkingSpot;
    public EmployeeParkingSpot(String name, int ID, int parkingSpot)
    {
        super(name,ID);
        this.parkingSpot = parkingSpot;
    }

    public int getParkingSpot()
    {
        return parkingSpot;
    }

    public void setParkingSpot(int spot)
    {
        parkingSpot = spot;
    }
}
