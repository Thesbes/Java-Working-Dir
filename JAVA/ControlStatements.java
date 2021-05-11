

public class ControlStatements {
    
    public static void main(String[] args) 
    {
        //for each
        //for(x in y)

        int[] y = {1,4,5,2,3,23,33,55,12};
        int z = 0;

        for(int x : y)
        {
            z+= x;
        }
        System.out.println(z);

        //switch
        int vehicle = 3;
        String type = null;
        switch(vehicle)
        {
            case 1:
                type = "car";
                break;
            case 2:
                type = "SUV";
                break;
            case 3:
                type = "truck";
                break;
        }
        //if/else
        if(type != null)
            System.out.println("Vehicle type = " + type);
        else
            System.out.println("Null vehicle type");

        //do while
        int i = 0;
        do
        {
            System.out.println(i);
            i++;
        }
        while (i<5);
    }
}
