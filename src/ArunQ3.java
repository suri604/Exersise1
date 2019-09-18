import java.util.Scanner;

public class ArunQ3 {
        public static void main(String [] args)
        {
            Scanner sc = new Scanner(System.in);
            String S =sc.nextLine();
            S=S.toLowerCase();
            int n= S.length();
            for(int i =0;i<n;i++)
            {
                if(S.charAt(i)=='a'||S.charAt(i)=='e'||S.charAt(i)=='i'||S.charAt(i)=='o'||S.charAt(i)=='u')
                {
                    System.out.print("Vowel" + " ");
                }
                else
                {
                    System.out.print("Consonant" + " ");
                }
            }

        }


}
