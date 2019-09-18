import java.util.Scanner;
import java.io.*;

public class ArunQ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num =n;
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }

        int[] A = new int[count];

        int i = 0;
        do {
            A[i] = num % 10;
            num= num/ 10;
            i++;
        } while(num!=0);

        int temp;
        for (int j = 0; j < count; j++)
            for (int k = 0; k < count-1; k++) {
                if (A[k] < A[k + 1]) {
                    temp = A[k + 1];
                    A[k + 1] = A[k];
                    A[k] = temp;
                }
            }
        int sum=0;
        for (int a = 0; a < count; a++) {
            if(A[a]%2==0)
            {
                sum=sum+A[a];
            }
        }
        if(sum>15)
        {
            System.out.print("True");
        }
        else
            System.out.print("false");
    }
}
