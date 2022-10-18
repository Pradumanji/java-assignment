import coordinates.*;
public class Question2pkg {
    public static void main()
    {
       Cartesian c = new Cartesian();
       polar p = new polar();
       c.toPolar(4, 5);
       p.toCartesian(4, 0.5);
    }
}
