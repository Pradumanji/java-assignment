import java.util.*;
class UserNumericString extends Exception
{
    String s;
    UserNumericString(String str)
    {
        str = s;
    }

    public String tostring(){
        return "a/b is very small less than 0.00001";
    }
}
public class Question3exce {
    

    static void check (String s) throws UserNumericString
    {
        for(int i = 0; i < s.length(); i++)
        {
            if( s.charAt(i) >= 47 && s.charAt(i) <= 58)
            {
                System.out.println("Exception Occured !!");
                throw new UserNumericString(s);
            }
        }

        System.out.println(" NO Exception ");
    }
        public static String tostring(){
            return "Exception..! String contain Number values as substring in it";
        }


        public static void main(String[] args)
        {
            String str;
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter String : ");
            str  = sc.nextLine();

            try{
                check(str);
                System.out.println("String is : " + str);
            }

            catch(UserNumericString n){
                System.out.println(tostring());
            }
        }
    }