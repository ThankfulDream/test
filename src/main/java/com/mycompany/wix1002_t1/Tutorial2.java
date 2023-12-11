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
public class Tutorial2 {
    public static void main (String[] args){
    //1a.
    System.out.print("Faculty of Computer Science ");
    System.out.println("and Information Technology");
    //1b.
    System.out.println("Faculty of Computer Science \nand Information Technology");
    
    //2.
    System.out.println("\"SDN\" - Software-defined networking");
    
    //3.
    System.out.println("Java Programming");
    System.out.println("Introduction to Java!");
    System.out.println("\\t is the horizontal tab character");
    System.out.println("Java is case sensitive!" );
    
    //4.
    String matric_number;
    double pi;
    boolean M = false;
    long P = 880000000;
    char letter = 'U';
    final String PRO = "Java";
    
    //5a.
    double AMOUNT = 32.5;
    AMOUNT += 10;
    System.out.println("The amount is " + AMOUNT);
    //5b.
    String chapter = "Summary";
    System.out.println(chapter);
    //5c.
    int num = 0;
    num++;
    int num1 = num;
    //5d.
    float num2 = 3000;
    System.out.printf("%4.2f \n", num2);
    //5e.
    String contact;
    Scanner keyboard = new Scanner(System.in);
    contact = keyboard.nextLine();
    
    //6.
    System.out.print("Enter diameter: ");
    double diameter = keyboard.nextFloat();
    double circumference = diameter*Math.PI;
    System.out.printf("The circumference of the circle is: %.3f \n", circumference);
    
    //7.
    System.out.print("Enter value in inch: ");
    double inch = keyboard.nextDouble();
    double metre = inch * 0.0254;
    System.out.printf("%.2f inches =  %.2f metre",inch,  metre );
    }
}
