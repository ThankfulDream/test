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
public class FOP23005032Q1 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the coordinate X and Y: ");
        int x = input.nextInt();
        int y = input.nextInt();
        input.nextLine();
        System.out.print("Enter the move: ");
        String move = input.nextLine();
        System.out.printf("Initial Coordinate (%d,%d)\n", x,y);
        for (int i = 0; i < move.length(); i++){
            switch(move.charAt(i)){
                case 'U' -> y++;
                case 'D' -> y--;
                case 'L' -> x--;
                case 'R' -> x++;
            }
        }
        System.out.printf("Final Coordinate (%d,%d)",x, y);
    }    
}
