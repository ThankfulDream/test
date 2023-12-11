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
public class pastyear2016q2{
    public static void main (String[]args){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        String [] rps = {"Paper", "Scissor", "Rock"};
        int pw=1, cw=1;
        
        do{
            System.out.print("Enter 1.Paper 2.Scissors 3.Rock: ");
            int p = input.nextInt();
            int c = rand.nextInt(1,4);
            
            System.out.printf("Player : %s ---- Computer : %s\n", rps[p-1], rps[c-1]);
            
            if (p==c){
                System.out.println("It's a draw!");
            }else if (p==(c+1)||(p==1&&c==3)){
                System.out.printf("Player win %d time(s)\n", pw);
                pw++;
            }else if (c==(p+1)||(c==1&&p==3)){
                System.out.printf("Computer win %d time(s)\n", cw);
                cw++;
            }
        }while(pw<4 && cw<4);
        
        if (pw==4){
            System.out.println("Player wins the game.");
        }else{
            System.out.println("Computer wins the game");
        }
    }
}
