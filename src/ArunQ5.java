
import java.util.Scanner;

public class ArunQ5 {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum=0;
        String[] n;
        n = s.split(" ");
        int num;
        for(int i=0;i< n.length;i++)
        {
            try{
                num=Integer.parseInt(n[i]);

            }catch(Exception e)
            {
                System.out.println("Not a valid input");
                return;
            }
            sum=sum+num;
        }
        System.out.println(sum);






    }
}