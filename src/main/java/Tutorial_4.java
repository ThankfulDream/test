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
public class Tutorial_4 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        Random rand = new Random();
        
        //1a.
        int i=1, n=0;
        for(; n<2000; i++){
            n = i*i*i;
        }
        System.out.printf("The largest integer n so that n is less than 2000 is %d\n", i-2);
        
        //1b.
        for(i=1; i<13; i++){
            System.out.printf("%d ", (i*i));
        }
        
        //1c.
        int row=4, column=5;
        for (i=0; i<row; i++){
            System.out.println("");
            for (int j=0; j<column; j++){
                System.out.printf("%3d", rand.nextInt(101));
            }                   
        }
        
        //1d.
        int sum=0;
        System.out.print("\nEnter a number: ");
        int num = input.nextInt();
        for (i=1; i<=num; i++){
            System.out.printf("%d%s", i, i==num?"":"+");
            sum += i;
        }
        System.out.printf(" = %d\n", sum);
        
        //1e.
        float a=1, b=25;
        float total = 0;
        for (i=0; i<25; i++){
            System.out.printf("%d/%d%s", (int)a, (int)b, i==24?"":"+");
            total += a/b;
            a++;
            b--;
        }
        System.out.printf(" = %.2f\n", total);
        
        //2a.
        for (int x = 10;x > 0; x--){
            sum += x;
        }
        //2b.
        int x=0, y=0;
        do{
            x += 2;
            y += x;
            System.out.println(x + " and " + y);
        }while (x < 100);
        //2c.
        for (x=1, y=20; x < y; x++, y-=2){
            System.out.println(x + " " + y);
        }
        //2d.
        i=0;
        while(i++<=10){
            if (i==10)
                System.out.println("Program End");
        }
        
        //3.
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        System.out.print("The first ten numbers of the Fibonacci sequence are: 1, 1, ");
        for (i=0; i<8; i++){
            System.out.printf("%d%s", (f1+f2), i==7? "":", ");
            f3 = f1;
            f1 = f2;
            f2 = f3+f2;
        }
        
        //4.
        String word;
        input.nextLine();
        System.out.print("\nInput a word: ");
        word = input.nextLine();
        System.out.printf("The string '%s' in reverse order is ", word);
        for (i=(word.length()-1); i>=0; i--){
            System.out.printf("%s", word.charAt(i));
        }
    }
}
