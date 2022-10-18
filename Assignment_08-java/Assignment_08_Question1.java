/* Reg no- 2021pgcaca001
1) Write a java program to input two strings str1, str2, and a length k, and output whether
   both string has a common substring of length k. If found, write the initial index of matching
  substring of both str1 and str2.
   Str1= “machester united”
   str2=”christian ronaldo”
   length=2
output = True, 2, 0 */

import java.util.Scanner;

class Assignment_08_Question1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String first : ");
        String str1 = sc.nextLine();
        System.out.println("Enter String Second : ");
        String str2 = sc.nextLine();
        System.out.println("Enter the length of the substring : ");
        int len = sc.nextInt();
        int count = 0;
        for (int i = 0; i + len <= str1.length(); i++) {
            String tmp1 = str1.substring(i, i + len);
            for (int j = 0; j + len <= str2.length(); j++) {
                String tmp2 = str2.substring(j, j + len);
                {
                    if (tmp1.equals(tmp2)) {
                        System.out.println("True : " + i + " " + j);
                        return;
                    }
                }
            }

        }
        System.out.println("Substring of lenght " + len + " not found");

    }

}
