import java.io.*;
import java.util.*;
import java.lang.*;

public class question3 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in feet : ");
        int n = sc.nextInt();
        System.out.println("Value in meter : " + n * 0.3048);
        System.out.println("Enter  minutes : ");
        int minutes = sc.nextInt();
        int years = minutes / (24 * 60 * 365);
        minutes = minutes % (24 * 60 * 365);
        int days = minutes / (24 * 60);
        minutes = minutes % (24 * 60);
        int rem_minutes = minutes;
        System.out.println("Years " + years + ", days " + days + " and minutes  " + rem_minutes);
        System.out.print("Enter value in horsh power : ");
        int horsh = sc.nextInt();
        double joule = horsh * 745.69;
        System.out.println(" horsh power  " + horsh + " = " + joule + " joule ");

    }

}
