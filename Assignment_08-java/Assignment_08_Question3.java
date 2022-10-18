
/* Reg no- 2021pgcaca001
 3) Write a java program to perform character circular left and right shift with the given
number of times.
Example: oliver
output: left by 2 -> iverol
right by 5 -> livero
 */
import java.util.Scanner;

public class Assignment_08_Question3 {
    public static void main(String args[]) {
        StringBuffer sc = new StringBuffer("oliver");
        boolean f = true;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("1) left by \n2) right by \n3) exit \n Enter your choice : ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter upto how many you want shifting : ");
                    int l = in.nextInt();
                    String t = sc.substring(0, l);
                    sc.append(t);
                    sc.delete(0, l);
                    System.out.println("New string : " + sc);
                    break;
                case 2:
                    System.out.println("Enter upto how many string you want to shift :");
                    int r = in.nextInt();
                    String temp = sc.substring(sc.length() - r, sc.length());
                    sc.delete(sc.length() - r, sc.length());
                    sc.insert(0, temp);
                    System.out.println("New string : " + sc);
                    break;
                case 3:
                    f = false;
                    break;
                default:
                    System.out.println("Please enter valid input!!");
            }
        }
    }
}
