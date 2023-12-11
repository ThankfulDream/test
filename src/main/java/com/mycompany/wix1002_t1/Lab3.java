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
public class Lab3 {
    public static void main (String[] args){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        //1.
        System.out.print("Enter two integer numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.print("Enter the operand: ");
        char operand = input.next().charAt(0);
        switch (operand){
            case '+' -> System.out.printf("%d + %d = %d", num1,num2, num1+num2);
            case '-' -> System.out.printf("%d - %d = %d", num1,num2, num1-num2);
            case '*' -> System.out.printf("%d * %d = %d", num1,num2, num1*num2);
            case '/' -> System.out.printf("%d / %d = %d", num1,num2, num1/num2);
            case '%' -> System.out.printf("%d %% %d = %d", num1,num2, num1%num2);
        }
        
        //2.
        String[] numbers = {"Zero", "One", "Two", "Three", "Four", "Five"};
        int num = rand.nextInt(6);
        System.out.printf("\n%d is %s", num, numbers[num]);
        
        //3.
        System.out.print("\nInput the sales volume: ");
        double volume = input.nextDouble();
        double commision;
        if (volume<=100){
            commision=volume*0.05;
        }else if (volume<=500){
            commision=volume*0.075;
        }else if (volume<=1000){
            commision=volume*0.1;
        }else{
            commision=volume*0.125;
        }
        System.out.printf("Sales: %.2f\nCommision: %.2f", volume, commision);
        
        //4.
        int p1=0, p2=0;
        p1 = rand.nextInt(1,7) + rand.nextInt(1,7);
        p2 = rand.nextInt(1,7) + rand.nextInt(1,7);
        System.out.printf("\nPlayer 1 score %d. Player 2 score %d. Player %s wins.", p1,p2, (p1>p2)? 1:2);
        
        //5.
        double a, b ,c, d, e, f, x, y;
        System.out.print("\nEnter the values of a, b, c, d, e, f: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();
        if (a*d-b*c==0){
            System.out.print("The equation has no solution");
        }else{
            x = (e*d-b*f)/(a*d-b*c);
            y = (a*f-e*c)/(a*d-b*c);
            System.out.printf("x = %.4f \ny = %.4f", x, y);
        }

        //6.
        double r;
        System.out.print("\nEnter the radius of a circle: ");
        r = input.nextDouble();
        System.out.print("Enter coordinates x and y: ");
        x = input.nextDouble();
        y = input.nextDouble();
        System.out.printf("The points %.2f,%.2f are %s the circle centred at (0,0).", x,y, (Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)))<=r)? "inside":"outside");
        
        //revision for week 5
        input.nextLine();
        String test = input.nextLine();
        char testt = test.charAt(1);
        System.out.println(testt);
    }
}