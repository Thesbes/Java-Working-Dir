//Will catch a few exceptions and return an exception message

public class ExceptionHandeling {

    //Divide by zero w/ exception handeling
    public static void zeroException()
    {
        int x = 0;
        int y = 100;
        for(int i = 5; i>= -5; i--)
        {
            try{
                x = y/i;
                System.out.println(y + "/" + i + "=" + x);
            }
            catch(ArithmeticException ex){
                System.out.println("Divide by zero is impossible!");
            }
        }
    }

    //indexOutOfBounds w/ exception handeling
    public static void indexOoB()
    {
        int[] arr = {0,1,2,3,4,5};
        System.out.println("");
        try{
            for(int i = 0; i <= 6; i++)
            {
                System.out.println(arr[i]);
            }
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println("Index out of bounds");
        }
    }

    public static void main(String[] args) {
        zeroException();
        System.out.println();
        indexOoB();
    }
    
}
