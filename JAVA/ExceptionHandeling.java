import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

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
                System.out.print(y + "/" + i + "=" + x);
            }
            catch(ArithmeticException ex){
                System.out.print("Divide by zero is impossible!");
            }
            //Code that must be excuted regardless of exception
            finally{
                System.out.println(" // You are beautiful");
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
    public static void fileReaderEx()
    {
        String str = "fakeDir/notARealFile";
        try{
            new FileReader(new File(str));
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("**" + str + "** cannot be found");
        }
    }

    public static void main(String[] args) {
        zeroException();
        System.out.println();
        indexOoB();
        fileReaderEx();
    }
}
