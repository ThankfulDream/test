/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wix1002_t1;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author AORUS
 */
public class pastyear2016q3 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of random integers: ");
        int[] number = new int[input.nextInt()];
        displaynumber(number);
        maximumnumber(number);
        roundnumber(number);
        reversenumber(number);
    }
    
    public static void displaynumber(int[] number){
        Random rand = new Random();
        System.out.print("The random integer: ");
        for (int i=0; i<number.length; i++){
            number[i] = rand.nextInt(1001);
            System.out.printf("%d ", number[i]);
        }
    }
    
    public static void  maximumnumber(int[] number){
        int max = number[0];
        for (int i=1; i<number.length; i++){
            if(number[i]>max)max=number[i];
        }
        System.out.printf("\nMaximumm Number: %d\n", max);
    }
    
    public static void roundnumber(int[] number){
        System.out.print("The approximation of the integer to the nearest tenth:");
        for (int i=0; i<number.length; i++){
            int num = (int)Math.round(number[i]/10.0) * 10;
            System.out.printf("%d ", num);
        }
    }
    
    public static void reversenumber(int[] number){
        System.out.print("\nThe random integeer in reverse order: ");
        int reverse=0;
        for (int i=0; i<number.length; i++){
            int num = number[i];
            for(; num!= 0; num/=10){
                int remainder = num % 10;  
                reverse = reverse * 10 + remainder;
            }        
            System.out.printf("%d ",reverse);
            reverse=0;
        }
    }
}
