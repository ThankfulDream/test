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
public class FOP2_23005032Q2 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int point=0, cycle=0, num;
        do{
            System.out.print("Enter a number (-1 to quit): ");
            num = input.nextInt();
            if(num==-1){
                break;
            }
            System.out.print("Enter a factor: ");
            int factor  = input.nextInt();
            input.nextLine();
            System.out.printf("%d is a factor of %d? (true/false): ", factor, num);
            String answer = input.nextLine();
            if ((num%factor==0 && answer.equals("true")) || (num%factor!=0 && answer.equals("false"))){
                System.out.println("Your answer is correct.");
                point++;
            }else{
                System.out.println("Your answer is false.");
            }
            cycle++;
        }while(num!=1);
        System.out.printf("The final score is %d/%d", point, cycle);
    }
}
