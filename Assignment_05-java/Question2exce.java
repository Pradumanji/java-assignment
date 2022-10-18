
//NAME      : Praduman                                       //COURSE CODE      : CA3307
//Reg. No.  : 2021PGCACA001                                //LABORATORY NAME  : CG and JAVA PROGRAMMING
//Branch    : MCA 3rd SEMESTER(2021)                        //ASSIGNMENT NO.   : ASSIGNMENT - 5
 
class UserVerySmallNumException extends Exception 
{
 String str1;
 UserVerySmallNumException(String str2) 
 {
    str1 = str2;
 }
    @Override
    public String toString() 
    {
        return ("UserVerySmallNumException Occurred: " + str1);
    }
}//ASSIGNMENT TITLE : Exception
public class Question2exce 
{
    public static void main(String[] args) 
    {
        double a,b;
        a=5.0;
        b=1000000;
        try 
        {
            double res= a/b;

            if(res < 0.00001)
            throw new UserVerySmallNumException(" error");
            else
            System.out.print(res);
        } 
        catch (UserVerySmallNumException exp) 
        {
            System.out.println("Catch Block");
            System.out.println(exp);
        } 
        finally 
        {
            System.out.println("this block always execute ");
        }
        System.out.println("message");
    }
}
