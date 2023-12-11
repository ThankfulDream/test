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
public class Lab2 { 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        //1.
        System.out.print("Enter the temperature in degree Fahrenheit: ");
        double f = input.nextDouble();
        double c = (f - 32)/1.8;
        System.out.printf("%.2f degree fahrenheit = %.2f degree celsius. ", f, c);
        
        //2.
        double P, D, R, Y, M;
        System.out.print("\nEnter the price of car: ");
        P = input.nextDouble();
        System.out.print("Enter the down payment: ");
        D = input.nextDouble();
        System.out.print("Enter the interest rate in %: ");
        R = input.nextDouble();
        System.out.print("Enter the loan duration in years: ");
        Y = input.nextDouble();
        M = (P-D)*(1+R*Y/100)/(Y*12);
        System.out.printf("Your monthly payment is RM %.2f \n", M);
        
        //3.
        double num;
        double sum = 0;
        double ave;
        for(int i=1;i<4;i++){
            num = (rand.nextDouble(10,50));
            System.out.printf("Number %d: %.2f \n", i, num);
            sum = sum + num;
        }
        ave = sum/3.0;
        System.out.printf("The sum of the numbers are %.2f and the average is %.2f \n", sum, ave);
        
        //4.
        int sec, min, hour, sec2;
        System.out.print("Enter the number of seconds: ");
        sec = input.nextInt();
        hour = sec/3600;
        min = (sec/60)%60;
        sec2 = sec%60;
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds\n",sec, hour, min, sec2);
        
        //5.
        int sumdigits = 0;
        int randomnumber = rand.nextInt(10000);
        System.out.printf("generated number: %d \n %d", randomnumber, randomnumber%10);
        sumdigits = sumdigits + (randomnumber%10);
        randomnumber /=10;
        while (randomnumber > 0){
            System.out.printf(" + %d", (randomnumber%10));
            sumdigits = sumdigits + (randomnumber%10);
            randomnumber /= 10;
        }
        System.out.printf(" = %d", sumdigits);

        //6.
        double Q, finaltemp, initialtemp;
        System.out.print("\nEnter the amount of water in gram: ");
        M = input.nextDouble();
        System.out.print("Enter the iniital temperature in Fahrenheit: ");
        initialtemp = input.nextDouble();
        System.out.print("Enter the final temperature in Fahrenheit: ");
        finaltemp = input.nextDouble();
        Q = (M/1000) * (((finaltemp - 32)/1.8) - (initialtemp-32)/1.8) * 4184;
        System.out.printf("The energy needed is %.6e \n", Q);
        
        //Extra Lecture Week 4 Questions
        do{
            System.out.print("Enter a random number (<0 TO STOP): ");
            num = input.nextInt();
        }while(num>=0);
        
                
        int[] point = new int [2];
        String[] month = {"January", "February"};
        System.out.print("Enter the points earned for January and February with the numbers separated by a space: ");
        point[0] = input.nextInt()/100;
        point[1] = input.nextInt()/100;
        for(int i=0; i<2; i++){
            System.out.print(month[i] + " - ");
            for(int j=0; j<point[i]; j++){
                System.out.print("$");
            }
            System.out.println("");
        }

        
        int total=0;
        num=0;
        while (total<=30){
            num = rand.nextInt(11);
            total += num;
            System.out.printf("%f ",num);
            if (total >30){
                break;
            }
        }
        System.out.printf("\nTotal %d \n", total);
 
        
        num=0;
        for (int i=0; i<5; i++){
            num = rand.nextInt(101); 
            if (num%2==1){
                i--;
                continue;
            }
            System.out.printf("%f ",num);
        }
   } 
}
