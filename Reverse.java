
import java.io.*;
import java.util.*;
import java.lang.*;
class Reverse
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        StringBuffer s=new StringBuffer(scan.next());
        s.reverse();
        System.out.println(s);
    }
}
