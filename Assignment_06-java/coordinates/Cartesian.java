package coordinates;

public class Cartesian {
    public void toPolar(int x,int y)
    {
        System.out.println("Polar coordinates (" +Math.sqrt(x*x + y*y) +","+ Math.atan2(y, x) +")");
    }
}
