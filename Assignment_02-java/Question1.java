// Question 1.
import java.util.Scanner;
class Question1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double x1,y1,x2,y2,x3,y3,x4,y4;
        System.out.println("Enter the end point of first line : ");
        x1 = sc.nextDouble(); y1 = sc.nextDouble(); 
        x2 = sc.nextDouble();  y2 = sc.nextDouble(); 
        double m1 = (y2-y1)/(x2-x1);
        System.out.println("Enter the end points of second line : ");
         x3 = sc.nextDouble();  y3 = sc.nextDouble(); 
        x4 = sc.nextDouble(); y4 = sc.nextDouble(); 
        double m2 = (y4-y3)/(x4-x3);
        if (m1==m2)
        System.out.println("Line 1 and Line2 are parallel. " + "Slope1 = "+ m1 + " and  Slope 2 = "+ m2);
        else
        System.out.println("Line 1 and Line2 are intersecting ." + "Slope1 = "+ m1 + "and  Slope 2 = "+ m2);
        
    }
}
