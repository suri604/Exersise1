import java.util.Scanner;

public class ArunQ9 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s= sc.nextLine();
        String c = "";
        int n = s.length();
        for(int i=n-1;i>=0;i--)
        {
            c = c + s.charAt(i);
        }

        System.out.println(c);

    }
}
