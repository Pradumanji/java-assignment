/*Reg no- 2021pgcaca001
2) Write a java program to input a string and perform inserting, replacing, and deleting a
substring using build-in methods. */
public class Assignment_08_Question2 {
    public static void main(String args[])
    {
        StringBuffer sc = new StringBuffer("Hello man");
        System.out.println("String before operation : "+ sc);
        sc.insert(5,"insert");
        System.out.println("String after insertion :"+ sc);
        sc.replace(0, 5, "replace");
        System.out.println("String after insert replace : "+ sc);
        sc.delete(0, 7);
        System.out.println("String after deletion : "+ sc);
    }
}
