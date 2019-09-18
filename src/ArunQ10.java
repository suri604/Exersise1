import java.util.Scanner;

public class ArunQ10 {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String S = sc.nextLine();

        System.out.println("Enter the Number: ");
        int n =sc.nextInt();

        int a =S.length();
        String s="";
        for(int i=a-n; i<=a-1;i++)
        {
            s = s + S.charAt(i);
        }



        for(int j=0;j<n;j++)
        {
            S =S+s;
        }
        System.out.print(S);
    }
}
