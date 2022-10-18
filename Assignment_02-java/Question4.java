// Question 4.
import java.util.Scanner;
import java.lang.Math;
class Question4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array : ");
        n = sc.nextInt();
        int []array1 = new int[n];
        int []array2 = new int[n];
        System.out.println("Enter elemnts of first array : ");
        for (int i=0; i<n; i++)
        array1[i] = sc.nextInt();
        System.out.println("Enter elemnts of second array : ");
        for (int i=0; i<n; i++)
        array2[i] = sc.nextInt();
        int []ans = new int[n];
        for (int i=0; i<n; i++)
        ans[i] = array1[i]*array2[i];
        System.out.println("product of elemnts of the given array : ");
        for (int i=0; i<n; i++)
        System.out.println("porduct of element "+ i + " : " + ans[i] );
        
    }
}

