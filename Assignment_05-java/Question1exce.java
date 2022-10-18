//NAME      : Praduman                                       //COURSE CODE      : CA3307
//Reg. No.  : 2021PGCACA001                                //LABORATORY NAME  : CG and JAVA PROGRAMMING
//Branch    : MCA 3rd SEMESTER(2021)                        //ASSIGNMENT NO.   : ASSIGNMENT - 5
//ASSIGNMENT TITLE : Exception
/*1) Write a Java program to handle each of the following exception during execution. 
     Write a suitable finally block for the selected exceptions wherever found appropriate.
     a) InterruptedException
     b) ArrayIndexOutOfBoundsException
     c) IllegalArgumentException
     d) IndexOutOfBoundsException
     e) NegativeArraySizeException
     f) NullPointerException
     g) IllegalAccessException*/

import java.util.*;

class UserVerySmallNumException extends Exception {
  double p;

  UserVerySmallNumException(double a) {
    p = a;
  }

  public String toString() {
    return "UserVerySmallNumException[" + p + "]";
  }
}

class Aa {
  void setmethod() throws IllegalAccessException {
    throw new IllegalAccessException("IllegalAccessException");
  }

  void getmethod() throws InterruptedException {
    throw new InterruptedException("InterruptedException");
  }
}

public class Question1exce {
  public static void arrayfyit(Scanner sc) {
    System.out.println("\nPerform some array operations");
    try {
      System.out.print("Enter The  size of array  : ");
      int arr = sc.nextInt();

      if (arr < 0)
        throw new NegativeArraySizeException(Integer.toString(arr));
      int[] a1 = new int[arr];
      System.out.print("\nEnter index between 0 to " + (arr - 1) + " and the value on that index : ");
      int k = sc.nextInt();

      if (k >= arr)
        throw new ArrayIndexOutOfBoundsException(Integer.toString(k));
      int val = sc.nextInt();
      a1[k] = val;
      System.out.println("\nGiven value inserted at given index.");
    } catch (NegativeArraySizeException e) {
      System.out.println("\nArray cannot be of negative size \n Size you entered : " + e.getMessage());
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("\nIndex not in range." + e.getMessage());
    } catch (IndexOutOfBoundsException e) {

    }
  }

  static void compute(double r, double s)
      throws UserVerySmallNumException {
    double m = r / s;
    if (m < 0.00001)
      throw new UserVerySmallNumException(m);
    else
      System.out.println("\nDivision of two numbers is : " + m);
  }

  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    try {
      div1(sc);
    } catch (Exception e) {
      System.out.println("\nCaught Exception.");
    } finally {
      System.out.println("\nYou have finished first and examined second exceptions");
      System.out.println("1.InputMismatchException \n"
          + "2.IllegalArgumentException");
    }

    try {
      arrayfyit(sc);
    } catch (Exception e) {
      System.out.println("\nAn UnknownError occured.");
    } finally {
      System.out.println("\nYou have finished second and examined third exceptions");
      System.out
          .println("1.NegativeArraySizeException \n2.ArrayIndexOutOfBoundsException \n3.IndexOutOfBoundsException");
    }

    String myStr = null;
    try {
      System.out.println(myStr.length());
    } catch (NullPointerException e) {
      System.out.println("\nDemonstrating NullPointerException.");
      // System.out.println("String is not containing anything.");
    } finally {
      System.out.println("\nYou have finished third & examined first exception");
      System.out.println("NullPointerException");
    }
    Aa a1 = new Aa();
    try {
      a1.setmethod();
      a1.getmethod();
    } catch (IllegalAccessException ex) {
      System.out.println("\nMain:" + ex);
    } catch (InterruptedException e) {
      System.out.println("\nMain" + e);
    } finally {
      System.out.println("\nYou have finished fourth & examined second exception");
      System.out.println("IllegalAccessException");
      System.out.println("InterruptedException");
    }

    try {
      System.out.print("\nEnter the two numbers : ");
      double p1 = sc.nextInt();
      double p2 = sc.nextInt();
      compute(p1, p2);
    }

    catch (UserVerySmallNumException q) {
      System.out.println("\nOutput is less than 0.00001 : " + q);
    }

    finally {
      System.out.println("\nYou have finished part fifth and examined first exception");
      System.out.println("UserVerySmallNumException");
    }
  }

  private static void div1(Scanner sc) {
    throw new UnsupportedOperationException("\nNot supported yet.");
  }
}