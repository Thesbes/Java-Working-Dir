

/*
    Exploring the diferences between String, StringBulder, and StringBuffer
*/
public class StringvBuildervBuffer {

    //Strings are Immutable; Thus s1 is a new object and cannot be referenced out of method scope
    public static void concat1(String s1)
    {
        s1 += " jumps over the lazy dog";
    }

    //StringBuilder is mutable; therefore s2 is actually changed
    public static void concat2(StringBuilder s2)
    {
        s2.append(" jumps over the lazy dog");
    }

    public static void concat3(StringBuffer s3)
    {
        s3.append(" jumps over the lazy dog");
    }

    public static void main(String[] args) {
        //String build
        String s1 = "The quick brown fox";
        concat1(s1);
        System.out.println(s1);
        //s1 not changed because strings are immutable

        //StringBuilder build
        StringBuilder s2 = new StringBuilder("The quick brown fox");
        concat2(s2);
        System.out.println(s2);
        //s2 is changed

        //StringBuffer Build
        StringBuffer s3 = new StringBuffer("The quick brown fox");
        concat3(s3);
        System.out.println(s3);
        //s3 is changed

        /*
            What is the difference between StringBuilder and StringBuffer?
                StringBuffer is threadsafe.
                    Comes with performance penalty.

            Use String when String can remain constant,
            Use StringBuilder when String may undergo changes and program runs in a single thread,
            Use StringBuffer when multithreading.

            Can pass String's ->StringBuilder and String Buffer (1)

            Can pass StringBuilder/Buffers -> String w/ toString() (2);

            StringBuilder->Buffer through string switching (3)
        */

            String tmp = "String to builder";
            StringBuilder s4 = new StringBuilder(s1); //(1)
            System.out.println(s4);

            tmp = s4.toString(); //(2)
            System.out.println(s1);

            StringBuilder strBuild = new StringBuilder("StringBuilder to StringBuffer"); //(3)
            tmp = strBuild.toString();
            StringBuffer strBuff = new StringBuffer(tmp);
            System.out.println(strBuff);
    }
}