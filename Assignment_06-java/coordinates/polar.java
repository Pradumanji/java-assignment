package coordinates;

public class polar {
    public void toCartesian(double r, double angle )
    {
        System.out.println("catersian coordinates (" + r*Math.cos(angle)+","+ r*Math.sin(angle) +")");
    }
}
