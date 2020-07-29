package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String s1 = sc.nextLine();
        System.out.print("Enter the second string : ");
        String s2 = sc.nextLine();

        System.out.println(s1 + " and " + s2 + " are "+ isAnagram(s1, s2));

        sc.close();
    }

    public static String isAnagram(String s1, String s2)
    {
        if (s1.length() != s2.length())
            return "not anagrams";

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s1.length(); i++)
        {
            char c = s1.charAt(i);
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }

        for (int i = 0; i < s2.length(); i++)
        {
            char c = s2.charAt(i);
            if (map.containsKey(c))
            {
                if (map.get(c) == 1)
                    map.remove(c);
                else
                    map.put(c, map.get(c) - 1);
            } else
                return "not anagrams";
        }

        if (map.size() > 0)
            return "not anagrams";
        else
            return "anagrams";
    }
}