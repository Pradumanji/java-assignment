// Question 6.
import java.util.Scanner;
import java.lang.Math;
class Question6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,r,n;
        System.out.println("Enter the first term , common ration and number of term in G.P series : ");
        a = sc.nextInt(); r = sc.nextInt();
        n = sc.nextInt();
        System.out.println("the G.P series are : ");
        for (int i=1; i<n; i++)
        {
            System.out.print(" "+ a + " ");
            a *= r;
        }
    }
}