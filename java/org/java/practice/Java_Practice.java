package org.java.practice;

import java.util.Scanner;
public class Java_Practice {
        public static void main (String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Please enter the Integer Number: ");
            int number=sc.nextInt();
            if(number%2==0){
                System.out.println("The Integer Number"+number+ " is an Even Number");
            }
            else{
                System.out.println("The Integer Number"+number+ " is an Odd Number");
            }
        }
    }
