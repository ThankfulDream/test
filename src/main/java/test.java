/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author AORUS
 */
public class test {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int num=2;
        boolean flag=true;
        System.out.print("Enter the number of prime numbers: ");
        int n = input.nextInt();
        System.out.printf("The first %d prime numbers are:\n", n);
        do{ 
            if (n==0){
                break;
            }
            for (int i=2; i<=num/2; i++){
                if ((num%i==0)){
                    flag = false;
                }
            }
            if (flag == true){
                System.out.printf("%d\n", num);
                n--;
            }
            num++;
            flag = true;
        }while(n>0);
    }
}
