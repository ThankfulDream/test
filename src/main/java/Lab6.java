/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author AORUS
 */
public class Lab6 {
    public static void main (String[] args){
        Random rand = new Random();
        Scanner input = new Scanner (System.in);
        
        triangular_number (20);
        
        System.out.print("\nState height of triangle/ diamond: ");
        int n = input.nextInt();
        System.out.println("Triangle");
        for (int i=1; i<=n; i++){
            multiPrint(i, '*');
            System.out.println();
        }
        System.out.println("Diamond");
        for (int i = 1; i <= n; i++) {
            // Print spaces before the stars
            multiPrint(n - i, ' ');

            // Print the stars
            multiPrint(2 * i - 1, '*');

            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            multiPrint(n - i, ' ');
            multiPrint(2 * i - 1, '*');

            System.out.println();
        }
        
        int[] numbers= new int[10];
        reverse_array(numbers);
        
        int a=24, b=8;
        int g = gcd(a, b);
        System.out.printf("\nGCD of %d, %d: %d", a, b, g);
        a=200;
        b=625;
        g = gcd (a, b);
        System.out.printf("\nGCD of %d, %d: %d\n", a, b, g);
        
        int ans, c=0;
        do{
            System.out.println("Enter negative number to quit.");
            a = rand.nextInt(13);
            b = rand.nextInt(13);
            System.out.printf("%d x %d = ",a,b);
            ans = input.nextInt();
            if (ans<0)break;
            boolean flag = multiply(a,b,ans);
            if (flag == true)c++;
        }while(ans>-1);
        System.out.printf("Your score is %d\n", c);
        
        int number=2;
        c=0;
        System.out.print("The first 20 palindromic prime numbers are: ");
        do{
            if (panlindromic(number)==true){
                System.out.printf(" %d ", number);
                c++;
            }
            number++;
        }while (c<20);
        c=0;
        number=2;
        System.out.print("\nThe first 20 emirp numbers are: ");
        do{
            if (emirp(number)==true){
                System.out.printf(" %d ", number);
                c++;
            }
            number++;
        }while (c<20);
    }
    
    
    
    
    public static void triangular_number(int num){
        int total=0;
        for (int i=1; i<num+1; i++){
            System.out.printf("%d%s", i, i==num?"":"+");
            total += i;
        }
        System.out.printf("= %d",total);
    }
    
    public static void multiPrint(int n, char c){
        for (int i=0; i<n; i++){
            System.out.print(c);
        }
    }
    
    public static void reverse_array(int[] numbers){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number of 10 digits: ");
        int num = input.nextInt();
        System.out.print("Reversed number: ");
        for (int i=numbers.length-1; i>-1; i--){
            numbers[i] = num%10;
            System.out.print(numbers[i]);
            num/=10;
        }      
    }
    
    public static int gcd(int a, int b){
        if (a == 0){
            return b;
        }
        return gcd(b % a, a);
    }
    
    public static boolean multiply(int a, int b, int ans){
        return a*b==ans;
    }
    
    public static boolean panlindromic(int number){
        int reverse=0, temp=number;
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                return false;
            }
        }
        for(;number != 0; number=number/10){  
            int remainder = number % 10;  
            reverse = reverse * 10 + remainder;  
        }
        return (reverse==temp);
    }
    
    public static boolean emirp(int number){
        int reverse=0, temp=number;
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                return false;
            }
        }
        for(;number != 0; number=number/10){  
            int remainder = number % 10;  
            reverse = reverse * 10 + remainder;  
        }
        if (reverse == temp) return false;
        for (int i = 2; i < reverse; i++){
            if (reverse % i == 0){
                return false;
            }
        }return true;
    }
}
