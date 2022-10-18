interface LinearDS{
    int MAXSIZE = 10;
    void add(int a);
    void remove();
    void displayElement();
}
class MyStack implements LinearDS{
    int i = -1;
    int size = 10;
    int arr[] = new int[size];
    public void add(int x)
    {
        if (i>size)
        {
            System.out.println("Stack is Full!");
        }
        else
        {
            i++;
            System.out.println("Succefully added"+x);
            arr[i] = x;
            

        }
        
    }
    public void remove ()
    {
        if (i<0)
        {
            System.out.println("Stack is Empty!");
        }
        else{
            int val = arr[i];
            System.out.println("The removed element is : "+val);
            i--;
        }
    }
    public void displayElement()
    {
        if (i<0)
        {
            System.out.println("Stack is Empty!");
        }
        else{
            System.out.println("Satck elemtnts are :- ");
            for (int j=i; j>=0; j--)
            {
                System.out.println(arr[j]+" ");
            }
        }
        
    }
}

class MyQueue implements LinearDS{
    
    int size = 10;
    int i = ;
    int arr[] = new int[size];
    public void add(int x)
    {
        if (i>size)
        {
            System.out.println("Stack is Full!");
        }
        else
        {
            i++;
            System.out.println("Succefully added"+x);
            arr[i] = x;
            

        }
        
    }
    public void remove ()
    {
        if (i<0)
        {
            System.out.println("Stack is Empty!");
        }
        else{
            int val = arr[i];
            System.out.println("The removed element is : "+val);
            i--;
        }
    }
    public void displayElement()
    {
        if (i<0)
        {
            System.out.println("Stack is Empty!");
        }
        else{
            System.out.println("Satck elemtnts are :- ");
            for (int j=i; j>=0; j--)
            {
                System.out.println(arr[j]+" ");
            }
        }
        
    }
}








public class Question3pkg {
    
}
