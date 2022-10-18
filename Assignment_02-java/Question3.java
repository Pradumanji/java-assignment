// Question 3.
import java.util.Scanner;
import java.lang.Math;
class Question3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double a,b;
        System.out.println("Enter two integer value : ");
        a = sc.nextDouble(); b = sc.nextDouble(); 
        double recu = r_gcd(a,b);
        System.out.println("Gcd of the given number is : "+ recu);
        double ite = i_gcd(a,b);
        System.out.println("Gcd of the given number is : "+ ite);
        
    }
   static double r_gcd(double a, double b)
    {
        if (b==0)
        return a;
        return r_gcd(b,a%b);
    }
    static double i_gcd(double a, double b)
    {
        if (b==0)
        return a;
        if (b>a)
        {
            double temp = a;
            a = b;
            b = temp;
        }
        return i_gcd(b,a-b); 
    }
}
