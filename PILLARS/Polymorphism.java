package PILLARS;

//Program meant to showcase the importance of polymorphism
//Examples of method overloading / method overriding


//Method overriding
//======================================
class Parent {
    void print()
    {
        System.out.println("This is the parent's print statement");
    }
    //In order for child to use superPrint() function, must be present in the parent
    void superPrint()
    {
        print();
    }
}

class Child extends Parent { //Also an example of inheritance
    void print()
    {
        System.out.println("This is the child's print statement");
    }
    //Can refer to parent class methods w/ super.method()
    void superPrint()
    {
        super.print();
    }
}
//======================================

public class Polymorphism {

    //Method overloading
    //======================================
    public static int add(int a, int b)
    {
        return a+b;
    }

    public static int add(int a, int b, int c)
    {
        return a+b+c;
    }
    //======================================

   public static void main(String[] args) {
       System.out.println("1 + 2 + 3 = " + add(1,2,3));
       System.out.println("4 + 5 = " + add(4,5));

       Parent objectOne = new Parent();
       objectOne.print();
       Parent objectTwo = new Child();
       objectTwo.print();
       objectTwo.superPrint();
   } 
}