import java.util.*;
public class Question3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int regno,capacity,noofsleeperseat;
        String model,owner,from,to,depttime,arrivaltime,isAc,isWifi;
        
        
        System.out.println("\t\t-: Enter The Luxury Public Bus Details :- ");

        System.out.println("Enter the Registration No:- ");
        regno = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Model No:- ");
        model =sc.nextLine();
        
        System.out.println("Enter the Capacity:- ");
        capacity = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Owner:- ");
        owner = sc.nextLine();

        System.out.println("Enter the From:- ");
        from = sc.nextLine();

        System.out.println("Enter the To:- ");
        to = sc.nextLine();

        System.out.println("Enter the Departure Time:- ");
        depttime = sc.nextLine();

        System.out.println("Enter the Arrival Time:- ");
        arrivaltime = sc.nextLine();

        System.out.println("Enter the No of Sleepr Seat:- ");
        noofsleeperseat = sc.nextInt();
        sc.nextLine();

        System.out.println("Is AC (Yes/NO):- ");
        isAc = sc.nextLine();

        System.out.println("Is WiFi (Yes/NO):- ");
        isWifi = sc.nextLine();

        LuxuryPublicBus lpb = new LuxuryPublicBus(regno, capacity, model, owner, from, to, depttime, arrivaltime, noofsleeperseat, isAc, isWifi);
        System.out.println("\n");

        System.out.println("\t\t-: Enter The Public Bus Details :- ");

        System.out.println("Enter the Registration No:- ");
        regno = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Model No:- ");
        model =sc.nextLine();
        
        System.out.println("Enter the Capacity:- ");
        capacity = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Owner:- ");
        owner = sc.nextLine();

        System.out.println("Enter the From:- ");
        from = sc.nextLine();

        System.out.println("Enter the To:- ");
        to = sc.nextLine();

        System.out.println("Enter the Departure Time:- ");
        depttime = sc.nextLine();

        System.out.println("Enter the Arrival Time:- ");
        arrivaltime = sc.nextLine();


        PublicBus pb = new PublicBus(regno, capacity, model, owner, from, to, depttime, arrivaltime);
        
        System.out.println("\n");
        System.out.println("\t\t-: Public Luxury Bus Details :-\n ");
        lpb.showbusdetails();

        System.out.println("\n");
        System.out.println("\t\t-: Public Bus Details :-\n ");
        pb.showbusdetails();

    }
}

// base class
class Bus {
	public int regno,capacity;
	public String model;


	public Bus(int regno, int capacity, String model)
	{
		this.regno=regno;
        this.capacity=capacity;
        this.model=model;
	}

    public void showbusdetails()
    {
        System.out.println("Bus Registration Number: - "+ regno);
        System.out.println("Bus Model: - "+ model);
        System.out.println("Bus Capacity: - "+ capacity);

    }

	
}

// derived class
class PublicBus extends Bus {

    public String owner,from,to,depttime,arrivaltime;

    PublicBus(int regno, int capacity, String model, String owner, String from, String to, String depttime, String arrivaltime)
    {
        super(regno,capacity,model);
        this.owner = owner;
        this.from = from;
        this.to = to;
        this.depttime = depttime;
        this.arrivaltime = arrivaltime;
    }

    public void showbusdetails()
    {
        super.showbusdetails();
        System.out.println("Owner :- "+ owner);
        System.out.println("From :- "+ from);
        System.out.println("To :- "+ to);
        System.out.println("Departure Time :- "+ depttime);
        System.out.println("Arrival Time :- "+ arrivaltime);
    }
}

class LuxuryPublicBus extends PublicBus
{
    int noofsleeperseat;
    String isAc, isWifi;

    LuxuryPublicBus(int regno, int capacity, String model, String owner, String from, String to, String depttime, String arrivaltime, int noofsleeperseat, String isAc, String isWifi)
    {
        super(regno, capacity, model, owner, from, to, depttime, arrivaltime);
        this.noofsleeperseat = noofsleeperseat;
        this.isAc = isAc;
        this.isWifi = isWifi;
    }

    public void showbusdetails()
    {
        super.showbusdetails();
        System.out.println("No Of Sleeper Seat :- "+ noofsleeperseat);
        System.out.println("Is AC :- "+ isAc);
        System.out.println("Is WiFi :- "+ isWifi);
    }

}