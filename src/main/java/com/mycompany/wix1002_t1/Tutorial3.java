/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wix1002_t1;

import java.util.Scanner;
/**
 *
 * @author AORUS
 */
public class Tutorial3 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        
        //1a.
        System.out.printf("3*8=27 is %s", (3*8==27)? "true":"false");
        
        //1b.
        int num;
        System.out.print("\nPlease input an integer: ");
        num = input.nextInt();
        System.out.printf("%d is an %s number.", num, (num%2==0)? "even":"odd");
        
        //1c.
        System.out.print("\nPlease input a letter: ");
        char letter = input.next().charAt(0);
        System.out.printf("%c is %s capital letter.", letter, (Character.isUpperCase(letter)? "a":"not a"));
             
        //1d.
        input.nextLine();
        System.out.print("\nPlease input word 1: ");
        String word1 = input.nextLine();
        System.out.print("Please input word 2: ");
        String word2 = input.nextLine();
        if(word1.compareToIgnoreCase(word2)<0){
            System.out.printf("%s %s", word1, word2);
        }else{
            System.out.printf("%s %s", word2, word1);
        }
        
        //1e.
        System.out.print("\nInput a number from 0-6: ");
        num = input.nextInt();
        switch(num){
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
        }
        
        //2a.
        int num1=0, num2=0;
        if (num1 == num2);
        System.out.println("Number 1 is equal to number 2.");
        //2b.
        int x=3,y=2,z=1;
        if (x > y && x > z);
        System.out.println("x is the largest number");
        //2c.
        String s1="HELLOWORLD", s2="HELLOWORLD";
        if (s1.equals(s2)){
            System.out.println("They are equal strings.");
        }else if(!s1.equals(s2)){
         System.out.println("They are not equal strings.");
        }
        //2d.
        if (x>0 || y>0);
        System.out.println("Either x or y is positive");
        
        /*
3a.
        #####
        $$$$$
3b.
        *****
3c.
        *****
        #####
3d.
        no output
*/

        //4.
        int num3;
        System.out.print("Input 3 numbers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        if (num3>num2 && num3>num1){
            System.out.printf("The largest number is %d", num3);
        } else if (num2>num3 && num2>num1){
            System.out.printf("The largest number is %d", num2);
        } else if (num1>num2 && num1>num3){
            System.out.printf("The largest number is %d", num1);
        }
        
        //5.
        System.out.print("\nInput a year: ");
        int year = input.nextInt();
        System.out.printf("%d is %s leap year.", year, ((year%4==0&&year%100!=0)||year%400==0)?  "a":"not a");
        
    }
}
