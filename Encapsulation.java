package PILLARS;

//The basis of encapsulation is to "hide" data types from other classes,
//and only allow modification in the current class

//Private vars
//Public getters/setters methods

public class Encapsulation {

    private int num1;
    private String str;
    public int num2;


    public int getNum()
    {
        return num1;
    }
    
    public String getStr()
    {
        return str;
    }

    public void setNum(int newNum)
    {
        num1 = newNum;
    }

    public void setStr(String newStr)
    {
        str = newStr;
    }
    public void info()
    {
        System.out.println("num1 = " + num1);
        System.out.println("str = " + str);
        System.out.println("num2 = " + num2);
    }
}