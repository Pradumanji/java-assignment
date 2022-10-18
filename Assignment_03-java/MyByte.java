import java.util.*;
public class MyByte {
    byte myData;
    //Default COnstructor;
    MyByte()
    {
        myData=0;
    }
    //Parametrized COnstructor;
    MyByte(byte d)
    {
        myData=d;
    }
    void orOP(MyByte m2)
    {
        byte res=(byte)((this.myData)|(m2.myData));
        System.out.println("Bitwise OR of "+this.myData+" and "+m2.myData+" is : "+res);
    }
    void andOP(MyByte m2)
    {
        byte res=(byte)((this.myData)&(m2.myData));
        System.out.println("Bitwise AND of "+this.myData+" and "+m2.myData+" is : "+res);
    }
    void xorOP(MyByte m2)
    {
        byte res=(byte)((this.myData)^(m2.myData));
        System.out.println("Bitwise XOR of "+this.myData+" and "+m2.myData+" is : "+res);
    }
    void complement()
    {
        byte res=(byte)(this.myData);
        byte i=1;
        byte num = res;
        while(i<=res)
        {
            res ^= i;
            i <<= 1;
        }
        System.out.println("Complement of "+this.myData+" is : "+res);
    }

    void mask()
    {
        byte n=this.myData;
        for (int i = 7; i >= 0; i--) {
            int k = n >> i;
            if ((k & 1) > 0)
                System.out.print("1");
            else
                System.out.print("0");
        }
        System.out.println();
    }

    public static void main(String [] args)
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for 1st object : " );
        byte b1=sc.nextByte();
        MyByte m1=new MyByte(b1);
        System.out.println("Enter value for 2nd object : ");
        byte b2=sc.nextByte();        
        MyByte m2=new MyByte(b2);
        
        
        do{
            System.out.println("------------Menu : ------------");
            System.out.println("1. Bitwise AND ");
            System.out.println("2. Bitwise OR ");
            System.out.println("3. Bitwise XOR ");
            System.out.println("4. mask ");
            System.out.println("5. Complement ");
            System.out.println("Enter your choice :");
            int c=sc.nextInt();

            switch(c)
            {
                case 1:
                m1.andOP(m2);
                break;

                case 2:
                m1.orOP(m2);
                break;

                case 3:
                m1.xorOP(m2);
                break;
                
                case 4:
                System.out.println("Performing mask for "+m1.myData+" : ");
                m1.mask();
                System.out.println("Performing mask for "+m2.myData+" : ");
                m2.mask();
                break;

                case 5:
                System.out.println("Complement for 1st object's data");
                m1.complement();
                System.out.println("Complement for 2nd object's data");
                m2.complement();
                break;

                default:
                System.out.println("Entered a wrong choice");
            }
            System.out.println("Do you want to continue ? Enter 'y'/'n'");
            ch=sc.next().charAt(0);
            
        }while(ch=='y'||ch=='Y');
     
    }
}
