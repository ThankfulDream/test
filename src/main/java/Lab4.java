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
public class Lab4 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        Random rand = new Random();
        
        //1.
        System.out.print("Enter an Integer: ");
        int num = input.nextInt();
        System.out.print("The factors are: ");
        for (int i=1; i<=num; i++){
            if (num%i==0){
                System.out.printf("%d%s ", i, i==num?"":"," );
            }
        }
        
        //2.
        System.out.print("\nEnter an integer n: ");
        int n = input.nextInt();
        int total=0;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.printf("%s%d%s%s", (i>1&&j==1)? "(":"", j, (j>=1&&j<i)? "+":"", (i>1)&&(i==j)? ")":"");
                total += j;
            }
            System.out.printf("%s", i==n? "":"+");
        }
        System.out.printf(" = %d\n", total);
        
        //3.
        int score, max_score=0, min_score=100, N=0, sum=0, sum_square=0;
        do{
            System.out.print("Enter a score [negative score to quit]: ");
            if ((score = input.nextInt())<0)break;
            sum += score;
            sum_square = sum_square + (score*score);
            if (score > max_score)max_score = score;
            if (score < min_score)min_score = score;
            N++;
        }while(score>=0);
        float s = (float) Math.sqrt((sum_square-(sum*sum/N))/(N-1));
        System.out.printf("Minimum Score: %d\nMaximum Score: %d\nAverage Score: %.2f\nStandard Deviation: %.2f\n", min_score, max_score, (float)(sum/N), s);
        
        //4.
        String month[] = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        int daymay=120, dayaug=212;
        if ((year%4==0&&year%100!=0)||year%400==0){
            daymay = 121;
            dayaug = 213;
        }
        System.out.print("Enter the first day of the year(0-Sunday...6-Saturday): ");
        int first = input.nextInt();
        int firstmay = (first+daymay)%7;
        int firstaug = (first+dayaug)%7;
        System.out.println("May");
        for (String month1 : month) {
            System.out.printf("%4s", month1);
        }
        System.out.println("");
        for(int i = 0; i < firstmay; i++) {
            System.out.printf("%4s", "");
        }
        for (int i = 1; i <= 31; i++) {
            System.out.printf("%4s", i);
            if ((i + firstmay) % 7 == 0) 
                System.out.println("");
        }
        
        System.out.println("\nAugust");
        for (String month1 : month) {
            System.out.printf("%4s", month1);
        }
        System.out.println("");
        for(int i = 0; i < firstaug; i++) {
            System.out.printf("%4s", "");
        }
        for (int i = 1; i <= 31; i++) {
            System.out.printf("%4s", i);
            if ((i + firstaug) % 7 == 0) 
                System.out.println("");
        }
        System.out.println("");
        
        //5.
        int dice, p1=0, p2=0;
        while (p1<=100 && p2<=100){
            System.out.print("Player 1 roll: ");
            do{
                dice = rand.nextInt(1,7);
                System.out.printf("%d ", dice);
                p1 += dice;
            }while(dice==6 && p1<101);
            if(p1>100){break;}
            System.out.print("\nPlayer 2 roll: ");
            do{
                dice = rand.nextInt(1,7);
                System.out.printf("%d ", dice);
                p2 += dice;
            }while(dice==6 && p2<101);
            if(p2>100){break;}
            System.out.println("");
        }
        System.out.printf("\nPlayer 1 score: %d\nPlayer 2 score: %d\n%s", p1, p2, p1>p2? "Player 1 wins":"Player 2 wins");
        
        //6.
        num = rand.nextInt();
        if (num<0)
            num*=-1;
        n=0;
        System.out.printf("\nGenerated number: %d\n", num);
        while (num>0){
            num/=10;
            n++;
        }
        System.out.printf("Number of digits: %d", n);
        
        //7.
        String category[]={"Month","Monthly payment","Principal","Interest","Unpaid Balance","Total Interest"};        
        System.out.print("\nEnter principal amount: ");
        double P = input.nextFloat();
        System.out.print("Enter interest in %: ");
        double I = input.nextFloat();
        System.out.print("Enter the total number of month(s): ");
        double m = input.nextFloat();     
        for(String category1 : category){
            System.out.printf("%-20s", category1);
        }
        float TL=0;
        for(n=1; n<13; n++){
            double M = (P*(I/(12*100))) / (1-(Math.pow((1+(I/(12*100))),(-m))));
            double C = M * Math.pow((1+(I/(12*100))), (-(1+m-n)));
            double L = M-C;
            double R = L/(I/(12*100))-C;
            TL += L;
            System.out.printf("\n%-20d%-20.2f%-20.2f%-20.2f%-20.2f%-20.2f", n, M,C, L, R, TL);     
        }
        
        //8.
        num=2;
        boolean flag=true;
        System.out.print("Enter the number of prime numbers: ");
        n = input.nextInt();
        System.out.printf("\nThe first %d prime numbers are: ", n);
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
                System.out.printf("%d%s", num, n==1? "":", ");
                n--;
            }
            num++;
            flag = true;
        }while(n>0);
    }
}
