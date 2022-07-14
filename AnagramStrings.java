package com.Surprise;

import java.util.Arrays;;
import java.util.Scanner;

public class AnagramStrings {
    public void checkAnagrams() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1 : ");
        String string1 = sc.nextLine();
        System.out.println("Enter String2 : ");
        String string2 = sc.nextLine();

        if (string1.length() != string2.length()) {
            System.out.println("Not An Anagram");
        } else {

            String string1LowerCase = string1.toLowerCase();
            String string2LowerCase = string2.toLowerCase();

            char[] string1Array = string1LowerCase.toCharArray();
            char[] string2Array = string1LowerCase.toCharArray();

            Arrays.sort(string1Array);
            Arrays.sort(string2Array);

            if (Arrays.equals(string1Array, string2Array)) {
                System.out.println("Anagram");
            }
            else {
                System.out.println("Not An Anagram");
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        new AnagramStrings().checkAnagrams();
    }
}
