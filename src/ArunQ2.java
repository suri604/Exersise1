import java.util.Scanner;

public class ArunQ2 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if(n%2==0)
        {
            if(n>=20&&n<=30)
            {
                System.out.println("Tom");
            }
        }
        else if (n%2!=0)
        {
            if(n>=20&&n<=30)
            {
                System.out.println("jerry");
            }
        }
    }
}
