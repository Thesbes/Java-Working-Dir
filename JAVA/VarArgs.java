package JAVA;

/*
    Learning and implementing VarArgs
    Used to implement methods with variable arguements

    Rules:
    1.) Each method can only have one VarArgs,
    2.) VarArg must be last parameter
*/
public class VarArgs {

    public static void test(String... Values) //Arguements use array framework
    {
        for(int i = 0; i<Values.length; i++)
        {
            System.out.println(Values[i]);
        }
    }
    
    public static void main(String[] args) {
        test("A","B","C","D");

    }
    
    
}
