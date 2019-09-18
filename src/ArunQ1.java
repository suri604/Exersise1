import java.util.*;

public class ArunQ1
{
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num =n;
        int rev=0;
        int rem;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==num)
        {
            System.out.println("number is a palindrome");
            int sum=0;
            while(rev>0)
            {
                int a = rev%10;
                if(a%2==0)
                    sum=sum+a;
                rev=rev/10;
            }
            if(sum>25)
            {
                System.out.println("sum is greater than 25: ");
                System.out.println("Success");
            }
            else
            {
                System.out.println("sum is less than 25: ");
                System.out.println("Failure");
            }
        }
        else
        {
            System.out.println("number is not a palindrome: ");
            System.out.println("Failure");
        }
    }
}
