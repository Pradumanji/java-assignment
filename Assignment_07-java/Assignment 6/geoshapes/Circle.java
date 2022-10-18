package Assignment 6.geoshapes;

public class Circle {
    double radius; double PI=3.14;
    public void area()
    {
        System.out.println("area of circle is" + (radius*radius*PI));
    }

    public void perimeter()
    {
        System.out.println("perimeter of circle is" + (2*PI*radius));

    }
}
