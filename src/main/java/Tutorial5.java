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
public class Tutorial5 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        Random rand = new Random ();
        //1a.
        float[] numbers =  new float[12];
        //1b.
        char[] alphabet = {'A','B','C','D','E'};
        //1c.
        String[] students_name = new String[100];
        //1d.
        int [][] table1d = new int [6][2];
        //1e.
        int [][] table1e = {{6,9},{2,5},{4,6}};
        //1f.
        table1e[1][1]=4;
        table1e[2][0]=3;
        table1e[2][1]=7;
        //1g.
        int [] contact = {0,1,2,3,4,5};
        for(int i=0; i<contact.length; i++){
                System.out.printf("%d\n", contact[i]);
        }
        
        //2a.
        String[] code = {"AAA", "AAB", "AAC", "AAD"};
        //2b.
        int[] num = new int[10];
        int sum=0;
        for(int k=0; k<num.length; k++){
            sum+=num[k];
        }
        //2c.
        int[][]t = new int[3][3];
        t[1][2] = 5;
        //2d.
        int i=4;
        int[]score = new int[5];
        score[i] = 78;
        score[--i] = 100;
        
        /*3.
        int[] marks = new int[5];
        i = 0;
        int j = 1;
        marks[i] = 12;
        marks[j] = marks[i] + 19;
        marks[j-1] = marks[j] * marks [j];
        marks[j*3] = marks[i+1];
        marks[++j] = marks[i]%5;
        marks[2*j] = marks[j-1];
        
        expected output:{961,31,1,31,31]
        */
        
        //4.
        int n=0;
        String [] sentence = {"the", "try", "hello","the", "THE"};
        for (String sentence1 : sentence){
            if (sentence1.equals("the"))n++;
        }
        System.out.printf("The word \"the\" appeared %d times.\n",n);
        
        //5.
        String [] name = {"Tom", "Aaron", "John", "Koga", "Eric"};
        System.out.println("The array and string in reverse order:");
        for (i=name.length-1; i>-1; i--){
            for (int j=name[i].length()-1; j>-1; j--){
                System.out.print(name[i].charAt(j));
            }
            System.out.print(" ");
        }
        
        //6.
        int decimal = rand.nextInt(256);
        int binary [] = new int [8];
        n=7;
        System.out.printf("\nGenerated number: %d\nBinary number:", decimal);
        do{
            binary[n] = decimal%2;
            decimal = decimal/2;
            if (decimal==1){
                binary[n-1]=1;
                break;
            }
            n--;
        }while(decimal>0);
        for(i=0; i<binary.length;  i++){
            System.out.print(binary[i]);
        }
    }
}
