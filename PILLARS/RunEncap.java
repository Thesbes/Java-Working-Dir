package PILLARS;

public class RunEncap {
    public static void main(String[] args) {
        Encapsulation test = new Encapsulation();
        test.num2 = 3; // the public variable in Encap is able to be modified

        /*
        Cannot directly modify private fields; use public methods to access and change
        test.num1 = 3; //Field is not visibile.
        test.str = "Hello World"; //Field is not visible
        */
        test.setNum(3); //sets test.num1 = 3
        test.setStr("Hello World"); //sets test.str = "Hello World"
        test.info();
    }
}
