import java.util.*;
class Battery{

    double eLevel;
    Battery()
    {
        eLevel=100;
    }
    void showLevel()
    {
        System.out.println("Current Battery level is : "+eLevel);
    }
    void sendMsg()
    {
        eLevel-=2;
        System.out.println("Current Battery level is : "+eLevel);
    }
    void recvMsg()
    {
        eLevel-=1;
        System.out.println("Current Battery level is : "+eLevel);
    }
    void compute()
    {
        eLevel-=1.5;
        System.out.println("Current Battery level is : "+eLevel);
    }
    void recharge(int m)
    {
        eLevel+=(m/2);
    }
    public static void main(String args[])
    {
        Battery bt=new Battery();
        char ch;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("--------Menu : ---------------");
            System.out.println("1. showLevel");
            System.out.println("2. sendMsg");
            System.out.println("3. recv Msg");
            System.out.println("4. compute");
            System.out.println("5. recharge");
            System.out.println("Enter your choice : ");
            int x=sc.nextInt();
            switch(x)
            {
                case 1:
                bt.showLevel();
                break;

                case 2:
                bt.sendMsg();
                break;

                case 3:
                bt.recvMsg();
                break;

                case 4:
                bt.compute();
                break;

                case 5:
                System.out.println("Enter minutes : ");
                int min=sc.nextInt();
                bt.recharge(min);
                break;

                default:
                System.out.println("Entered a wrong choice");

            }
            System.out.println("Do you want to continue? Enter 'y'/'n'");
            ch=sc.next().charAt(0);
            
        }while(ch=='y'|| ch=='Y');
    }

}
