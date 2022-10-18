// Question 5.
import java.util.Scanner;
import java.lang.Math;
class Question5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array : ");
        n = sc.nextInt();
        int []array1 = new int[n];
        int []freq = new int[n];
        System.out.println("Enter elemnts of the array : ");
        for (int i=0; i<n; i++)
        array1[i] = sc.nextInt();
        int vist = -1;
        for (int i=0; i<n; i++)
        {
            int count=1;
            for (int j=i+1; j<n; j++)
            {
                if (array1[i]==array1[j])
                {
                    count++;
                    freq[j] = vist;
                }
            }
            if (freq[i]!=vist)
            freq[i] = count;
        }
        System.out.println("array elements and there frequency are : ");
        for (int i=0; i<n; i++)
        {
            if (freq[i]!=vist)
            {
            System.out.print("" + array1[i] + " occurs " + freq[i] + " times ");
            System.out.println();
            }
            
        }
        
    }
}

