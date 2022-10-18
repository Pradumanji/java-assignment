 package geoshapes;
public class Triangle{
   public void perimeter (int height, int width)
   {
      int  diagonale = (height*height)+(width*width);
    System.out.println("Perimeter of Triangle : "+ (diagonale+ height + width));
   }
   public void area(int height, int width)
   {
    System.out.println("Area of Triangle "+ 0.5*(height*width));
   }
}

