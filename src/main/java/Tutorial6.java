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
public class Tutorial6 {
    public static void main (String[] args){
        Scanner input =  new Scanner (System.in);
        max_integer();
        square_number();
        subset();
        pentagonal_number();
        letter_digit();
        int[]num = new int[10];
        random_numbers(num);
        System.out.print("\nEnter the radius of a circle: ");
        circle(input.nextFloat());
        System.out.printf("\nThe first random number to generate twice is %d.",twice_random_number());
        numbers_decreasing();
    }
    
    
    public static void max_integer(){
        Scanner input = new Scanner (System.in);
        int [] number = new int [3];
        System.out.print("Input 3 numbers separated by spaces: ");
        for (int i=0; i<number.length;i++){
            number[i]=input.nextInt();
        }
        int max = number[0];
        for (int number1: number){
            if (number1 > max) max = number1;
        }
        System.out.printf("The largest number is %d", max);
    }
    
    public static void square_number(){
        Scanner input = new Scanner (System.in);
        System.out.print("\nDetermine if it is a square number: ");
        int num = input.nextInt();
        if (Math.sqrt(num)>0 && Math.sqrt(num)%1==0){
            System.out.println("It is a square number");
        }else{
            System.out.println("It is not a square number.");
        }
    }
    
    public static void subset(){
        Scanner input = new Scanner (System.in);
        System.out.print("How many elements are in your set? ");
        int n = input.nextInt();
        System.out.print("How many elements are in your subset? ");
        int k = input.nextInt();
        int n_fact=1, k_fact=1, n_kfact=1;
        for (int i=2; i<=n; i++){
            n_fact*=i;
        }
        for (int i=2; i<=k; i++){
            k_fact*=i;
        }
        for (int i=2; i<=(n-k); i++){
            n_kfact*=i;
        }
        System.out.printf("The total number of %d-element subsets that can be found in a given set of %d elements is %d.",k,n, (n_fact/(k_fact*n_kfact)));
    }
    
    public static void pentagonal_number(){
        Scanner input = new Scanner (System.in);
        System.out.print("\nEnter a number to determine if it is a pentagonal number: ");
        int num = input.nextInt();
        for (int i=1; i<num; i++){
            if (i*(3*i-1)/2==num){
                System.out.printf("%d is a pentagonal number.", num);
                break;
            }else if (i*(3*i-1)/2>num){
                System.out.printf("%d is not a pentagonal number.", num);
                break;
            }
        }
    }
    
    public static void letter_digit(){
        Scanner input = new Scanner (System.in);
        int digit=0, letter=0;
        System.out.print("\nEnter some words: ");
        String word = input.nextLine();
        for (int i=0; i<word.length();i++){
            if (Character.isDigit(word.charAt(i))){
                digit++;
            }else if (Character.isLetter(word.charAt(i))){
                letter++;;
            }
        }
        System.out.printf("The words \"%s\" contain %d letters and %d numbers.", word, letter, digit);
    }
    
    public static void random_numbers(int [] num){
        Random rand = new Random();
        for (int i=0; i<num.length; i++){
            num[i] = rand.nextInt(101);
        }
    }
    
    public static void circle (float r){
        System.out.printf("Area of circle: %.2f\nCircumference of circle: %.2f", (Math.PI*r*r), (Math.PI*2*r));
    }
    
    public static int twice_random_number(){
        Random rand = new Random();
        boolean [] numbers = new boolean [11];
        int n=1;
        do{
            int i = rand.nextInt(12);
            if (numbers[i]==true){
                return i;
            }else{
                numbers[i]=true;
            }
            i++;
        }while(n<13);
        return n;
    }
    
    public static void numbers_decreasing(){
        Scanner input = new Scanner (System.in);
        int [] numbers = new int [3];
        System.out.print("\nEnter 3 numbers separated by spaces: ");
        for (int i=0; i<numbers.length; i++){
            numbers[i]=input.nextInt();
        }
        for (int pass=numbers.length; pass>1; pass--){
            for (int i=numbers.length-1; i>0; i--){
		if (numbers[i]>numbers[i-1]){
                    int hold = numbers[i]; 
                    numbers[i] = numbers[i-1];  
                    numbers[i-1] = hold;
                }
            }
        }
        System.out.println("The numbers in descending order:");
        for (int i=0; i<numbers.length; i++){
            System.out.printf("%d%s ", numbers[i], i==numbers.length-1? "":",");
        }
    }
}
