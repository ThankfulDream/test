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
public class FOP23005032Q2 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        String type;
        float totalsales=0;
        do{
            System.out.print("Enter the type of durian [Quit] to terminate: ");
            type = input.nextLine();
            if (type.equals("Quit")){
                break;
            }else{
                System.out.print("Enter the sales in kg: ");
                float sales = input.nextFloat();
                input.nextLine();
                switch(type){
                    case "MK" -> sales = sales*25;
                    case "HL" -> sales = sales*22;
                    case "D24" -> sales = sales*20;
                    case "UM" -> sales = sales*18;
                }
                totalsales += sales;
            }
        }
        while(!type.equals("Quit"));
        System.out.printf("Total Sales: %.2f", totalsales);
    }
}
