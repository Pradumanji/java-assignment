import java.util.Scanner;
class Question1{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first time (with space) in hour ,minute and second: ");
      byte h = sc.nextByte();
      byte m = sc.nextByte();
      byte s = sc.nextByte();
      System.out.println("Enter the second time (with space) in hour,minute and second: ");
      byte hh = sc.nextByte();
      byte mm = sc.nextByte();
      byte ss = sc.nextByte();
      time t1 = new time(h,m,s);
      time t2 = new time(hh,mm,ss);
      time t3 = new time();
      System.out.println("************MENU*****************\n1.DisplayTime\n2.Add Time\n3.Subtract Time\n4.Convert to hours\n5.Convert to seconds");
      char ch;
      byte choice;
      int f=0;
      do{
    System.out.println("Enter the choice: ");
    choice = sc.nextByte();
   
   switch(choice){
    case 1:if(f==0)
    {
        t1.displaytime();
        t2.displaytime();
    }else{
        t3.displaytime();
    }
    break;
    case 2:t3.Addtime(t1, t2);
    t3.displaytime();
    f=1;
    break;
    case 3:t3.Subtracttime(t1, t2);
    t3.displaytime();
    f=1;
    break;
    case 4:t3.tohours();
    break;
    case 5:t3.toseconds();
    break;
    
    default: System.out.println("Invalid choice!!");
   }
   System.out.println("Do you want to continue (y/n): ");
   ch = sc.next().charAt(0);
      }while(ch=='y'||ch=='Y');  
    }
}
class time{
    
    private int hour,min,sec;
    time(){
        this.hour = 0;
        this.min = 0;
        this.sec=0;
    }
    time(int h,int m,int s){
        this.hour = h;
        this.min = m;
        this.sec  =s;
    }
    void displaytime(){
        System.out.println("Present time is: "+hour+":"+min+":"+sec);
    }
    void Addtime(time a,time b){
        hour = (a.hour + b.hour)%12;
        min = a.min + b.min;
        hour  = (hour+min/60)%12;
        min = min%60;
        sec = a.sec + b.sec;
        min = min+sec/60;
        sec = sec%60;
        System.out.println(" After adding, our current time will be: "+hour+":"+min+":"+sec);
    }
    void Subtracttime(time a,time b){
        hour = a.hour - b.hour;
        if(hour<0)
        hour+=12;
        min = a.min - b.min;
        if(min<0){
            min = min+60;
            hour = hour-1;
            if(hour<0)
            hour+=12;
        }
        sec = a.sec - b.sec;
        if(sec<0){
            sec = sec+60;
            min = min-1;
            if(min<0){
                min = min+60;
                hour = hour-1;
                if(hour<0)
                hour+=12;
            }
        }
        System.out.println(" After subtracting, our current time will be: "+hour+":"+min+":"+sec);
    }
    void toseconds(){
        float res;
        res = sec+(min*60)+(hour*60*60);
        System.out.println("After converting our current time to seconds will be: "+ res);
    }
    void tohours(){
        float res;
        res = (float)hour+((float)min+(float)sec / 60) / 60;
        System.out.println("After converting our current time to hours will be: "+ res);
    }

}