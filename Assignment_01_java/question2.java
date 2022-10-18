import java.io.*;
import java.util.*;
import java.lang.*;
public class question2 {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number : ");
       int n = sc.nextInt();

   // int n=5;
    for (int i=0; i<n; i++)
    {
            for (int j=0; j<n; j++)
            {
                System.out.print((i*j)%n +" ");
            }
            System.out.println();
    }
}
};
