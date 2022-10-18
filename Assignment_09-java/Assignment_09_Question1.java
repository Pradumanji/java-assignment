/*Reg No- 2021pgcaca001
 1) Write a program to use ArrayList to implement railway ticket booking operations
 */
import java.util.*;

class Railwayticket {

    ArrayList<String> a;
    int max;

    Railwayticket(int max) {
        this.a = new ArrayList<>();
        this.max = max;
    }

    void bookticket() {
        if (this.a.size() >= this.max) {
            System.out.println("no ticket available");
        } else {
            System.out.println("enter name of the candidate");
            Scanner in = new Scanner(System.in);
            String name = in.next();
            a.add(name);
            System.out.println("ticket booked");
        }
    }

    void cancelticket() {
        System.out.println("enter name of the candidate whose ticket you want to cancel");
        Scanner in = new Scanner(System.in);
        int index = -1;
        String name = in.next();
        for (int j = 0; j < this.a.size(); j++) {
            String t = a.get(j);
            if (name.equals(t) == true) {
                a.remove(j);
                index = j;
                break;
            }
        }
        if (index == -1)
            System.out.println("No data found \n please enter valid name ");
        else
            System.out.println("Ticket canceled");
    }

    void ticketleft() {
        int ans = max - a.size();
        System.out.println("ticket left : " + ans);
    }
}

class Assignment_09_Question1 {
    public static void main(String args[]) {
        Railwayticket r1 = new Railwayticket(10);
        boolean f = true;
        while (f) {
            System.out.println("\n********MENU********\n1: bookticket \n2: cancelticket \n3: ticketleft \n4:exit \n Please choose valid option ");
            Scanner in = new Scanner(System.in);
            int c = in.nextInt();
            switch (c) {
                case 1:
                    r1.bookticket();
                    break;
                case 2:
                    r1.cancelticket();
                    break;
                case 3:
                    r1.ticketleft();
                    break;
                case 4:
                    f = false;
                    break;
                default:
                    System.out.println("Please enter valid option");
            }
        }
    }

}
