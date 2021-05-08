package PILLARS;

/*

Demonstrates abstraction class employee to use as a parent class for both salary and employee parking spot

*/

public class AbstractDemo {
    public static void main(String[] args) {
        Salary jim = new Salary("Jim",1,55000);
        Salary mary = new Salary("Mary",2, 0);
        EmployeeParkingSpot jesse = new EmployeeParkingSpot("jesse", 3, 0);
 
        jim.info();

        mary.info();
        
        mary.newSalary(5500);

        mary.info();

        jim.weeklyPay();

        jesse.setParkingSpot(1);
        System.out.println(jesse.parkingSpot);
    }


}
