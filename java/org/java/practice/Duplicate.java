package org.java.practice;

    import java.util.*;
    public class Duplicate {
        public static void main(String[] args) {
            String str="Java API Java";
            String [] str1=str.split(""); // No space
            Set<String> set = new LinkedHashSet<>(Arrays.asList(str1));
            String output=String.join("",set);
            System.out.println(output);
        }
    }


