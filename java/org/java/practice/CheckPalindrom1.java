package org.java.practice;

public class CheckPalindrom {
        public static void main(String[] args) {
            String str="madam";
            String reverse="";
            int ln=str.length();
            for(int i=ln-1;i >=0;i--){
                reverse=reverse+str.charAt(i);
            }
            System.out.println("The reverse of "+str+" is "+reverse);
            if(reverse.equals(str)){
                System.out.print(str+" String is Palindrom");
            }
            else{
                System.out.print(str+" String is not a Palindrom");
            }

        }
    }


