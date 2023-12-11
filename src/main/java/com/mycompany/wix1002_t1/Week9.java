/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wix1002_t1;

/**
 *
 * @author AORUS
 */

import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.EOFException;
import java.util.Random;
import java.util.Scanner;

public class Week9 {
    public static void main (String[] args){
        try{
            PrintWriter pw = new PrintWriter(new FileOutputStream("currency.txt"));
            pw.printf("USD 0.245\nEUR 0.205\nGBP 0.184\nAUD 0.332\nTHB 7.41");
            pw.close();
        }catch(IOException e){
            System.out.println("Error");
        }
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("currency.txt"));
            String input;
            while((input = br.readLine()) != null)
            System.out.println(input);
            br.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }catch(IOException e){
            System.out.println("Error reading file");
        }
        
        System.out.println(getCurrency(1000, "THB"));
        
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of random numbers you want to generate: ");
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("randomnumbers.dat", true));
            for(int i=0; i<input.nextInt(); i++){
                oos.writeInt(rand.nextInt(10,101));
            }
            oos.close();
        }catch (IOException e){
            System.out.println("Error reading file");
        }
        
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("randomnumbers.dat"));
            try {
                while(true){
                    System.out.println(ois.readInt());
                }
            }catch(EOFException e) {
                System.out.println("Error?");
            }
            ois.close();
        }catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }catch (IOException e){
            System.out.println("Problem with file input.");
        }
    }
    
    public static double getCurrency (double rm, String currency){
        double result=0;
        try{
            BufferedReader br = new BufferedReader(new FileReader("currency.txt"));
            String input;
            while((input = br.readLine()) != null){
                String[] parts = input.split("\\s+");
                String text = parts[0];
                double rate = Double.parseDouble(parts[1]);
                if (text.equalsIgnoreCase(currency)){
                    result = rate*rm;
                }   
            }
            br.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }catch(IOException e){
            System.out.println("Error reading file");
        }
        return (result);
    }
}
