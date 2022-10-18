import geoshapes.Circle;
import geoshapes.Rectangle;
import geoshapes.Triangle;
import geoshapes.Sphere;
public class Question1pkg{
 public static void main(String []args) {
       Circle c = new Circle();
       Rectangle r = new Rectangle();
       Triangle t = new Triangle();
       Sphere s = new Sphere();
       c.area(4);
       c.perimeter(5);
      // r.Rectangle(4,5);
       r.area(2,4);
       r.perimeter(4,5);
       t.area(4,5);
       t.perimeter(4,5);
       s.area(6);
       s.perimeter(5);
    }
}