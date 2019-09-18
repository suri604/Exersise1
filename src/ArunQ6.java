import java.util.Scanner;
import java.io.*;

public class ArunQ6 {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char b = s.charAt(0);
        int as = (int)b;

        if(as>=65&&as<=90)
        {
            System.out.println("Capital");
        }
    else if(as>=48&&as<=57)
    {
        System.out.println("Digit");
    }
    else if(as>=97&&as<=122)
    {
        System.out.println("Small");
    }
    else
        {
            System.out.println("special character");
        }





    }


}
