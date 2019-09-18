import java.util.Scanner;
import java.io.*;

public class ArunQ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n;
        while ((n = sc.nextInt()) != 60) {
            if (n > 60) {
                System.out.println("Number is greater");
            } else if (n < 60) {
                System.out.println("Number is smaller");
            }
        }
        if (n == 60) {
            System.out.println("Number is matched");
        }
    }
}
