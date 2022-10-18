// Question 2.
import java.util.Scanner;
import java.lang.Math;
class Question2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double x1,y1,radius,x3,y3;
        System.out.println("Enter the center point of the circle : ");
        x1 = sc.nextDouble(); y1 = sc.nextDouble(); 
        System.out.println("Enter the radius of the circle : ");
          radius = sc.nextDouble(); 
        System.out.println("Enter another points of the circle : ");
         x3 = sc.nextDouble();  y3 = sc.nextDouble(); 
         double distance = Math.sqrt((y3-y1)*(y3-y1) + (x3-x1)*(x3-x1));
        
        if (distance>radius)
        System.out.println("points lies outside of the circle.");
        else if(distance<radius)
        System.out.println("points lies inside of the circle.");
        else
        System.out.println("points lies on the surface of the circle.");
        
        
    }
}
