/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wix1002_t1;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author AORUS
 */
public class WIX1002_T1 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Random rand = new Random();
       System.out.print("CHECK IF YOU ARE ELIGIBLE FOR DISCOUNT \nENTER AGE:");
       int age = input.nextInt();
       System.out.print("ENTER GENDER (0 male, 1 female):");
       int gender = input.nextInt();
       System.out.print("ENTER DAY OF WEEK (1-MONDAY, 7-SUNDAY):");
       int day = input.nextInt();
       String ans = (age >= 50 && gender==1 && day==2) ? "ELIGIBLE FOR DISCOUNT!" : "NOT ELIGBLE FOR DISCOUNT BECAUSE: \nAGE YOUNGER THAN 50 \nYOU ARE MALE \nIT IS NOT TUESDAY" ;
       System.out.println(ans);
       
       String txt1 = "bM", txt2 = "am";
       System.out.println(txt1.compareTo(txt2));
       
       int p1=0,p2=0;
       while(p1>6 || p1<1){
           System.out.print("ENTER PLAYER 1 DICE: ");
           p1 = input.nextInt();
       }
       while(p2>6 || p2<1){
           System.out.print("ENTER PLAYER 2 DICE: ");
           p2 = input.nextInt();
       }
       if (p1 > p2){
           System.out.println("PLAYER 1 WINS");
       }else if (p2 > p1){
           System.out.println("PLAYER 2 WINS");
       }else{
           System.out.println("ITS A DRAW");
       }
       
       int number = input.nextInt();
       switch(number){
           case 1 -> System.out.println("Draw Pie Chart");
           case 2 -> System.out.println("Draw Line Chart");
           case 3 -> System.out.println("Draw Bar Chart");
           default -> System.out.println("Invalid choice.");
       }
    }
}
