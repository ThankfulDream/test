/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wix1002_t1;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author AORUS
 */
public class FOP2_23005032Q1 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        Random rand = new Random();
        int n=0;
        System.out.print("Enter the number of staff [N]: ");
        int j = input.nextInt();
        for (int i=0; i<j; i++){
            int ID = rand.nextInt(10000, 100000);
            System.out.printf("Staff ID: %d\n", ID);
            if ((ID/10%10%2==0) && (ID/1000%10%2==1)){
                System.out.println("Weekend Duty");
                n++;
            }else{
                System.out.println("Weekend Off");
            }
        }
        System.out.printf("The number of staffs work during weekend is %d ", n);
    }
}
