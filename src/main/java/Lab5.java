/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author AORUS
 */
public class Lab5 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        Random rand = new Random();
        
        //1.
        System.out.print("Enter the number of students to generate score: ");
        float [] score =  new float [input.nextInt()];
        float total=0, max=0, min=100;
        System.out.println("List of student scores: ");
        for (int i=0; i<score.length; i++){
            score[i] = rand.nextInt(101);
            System.out.printf("%.0f\n", score[i]);
            total += score[i];
            if (score[i]<min) min=score[i];
            if (score[i]>max) max=score[i];
        }
        float ave = total/score.length;
        System.out.printf("highest score: %.0f\nlowest score: %.0f\naverage score: %.2f\n", max, min, ave);
        
        //2.
        System.out.println("10 random non-duplicate numbers from 0-20");
        ArrayList<Integer> num = new ArrayList<>();
        int n=0, integer;
        do{
            integer = rand.nextInt(21);
            if (!num.contains(integer)){
                num.add(integer);
            }
        }while(num.size()<10);
        System.out.println(num);
        
        //2. alternate/ more efficient answer
        HashSet <Integer> nums = new HashSet <Integer>();
        while(nums.size()<10)nums.add(rand.nextInt(21));
        nums.forEach(x -> System.out.printf("%d ", x));
       
        
        //3.
        System.out.print("\nInput the number of employees: ");
        int [][] work_hours = new int [input.nextInt()][7];
        int total_work_hours=0;
        for (int i=0;i<work_hours.length; i++){
            System.out.printf("Employee %d work hours: ", (i+1));
            for (int j=0; j<work_hours[0].length; j++){
                work_hours [i][j] = rand.nextInt(1, 9);
                System.out.printf("%d ", work_hours[i][j]);
                total_work_hours += work_hours[i][j];
            }
            System.out.printf("Total work hours: %d\n", total_work_hours);
            total_work_hours = 0;
        }
        
        //4.
        //generate matrix
        int [][] matrix = new int [3][3];
        System.out.println("3 by 3 Matrix");
        for (int[] matrix1 : matrix) {
            for (int j = 0; j<matrix[0].length; j++) {
                matrix1[j] = rand.nextInt(1, 9);
                System.out.printf("%d ", matrix1[j]);
            }
            System.out.println("");
        }
        //transpose matrix
        for (int i=0; i<matrix.length; i++){
            for (int j = i; j<matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp; 
            }
        }
        //swapping element between 1st and last column
        for (int[] matrix1 : matrix) {
            int low=0, high=matrix.length-1;
            while (low < high) {
                int temp = matrix1[low];
                matrix1[low] = matrix1[high];
                matrix1[high] = temp;
                low++;
                high--;  
            }
        }
        System.out.println("After rotate 90 Matrix");
        for (int[] matrix1 : matrix) {
            for (int j = 0; j<matrix[0].length; j++){
                System.out.printf("%d ", matrix1[j]);
            }
            System.out.println("");
        }
        
        //5.
        int [] numbers = new int [20];
        System.out.println("A list of 20 random integer within 0 to 100");
        for (int i=0; i<numbers.length; i++){
            numbers[i] = rand.nextInt(101);
            System.out.printf("%d%s ", numbers[i], i==numbers.length-1? "":",");
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
        System.out.println("\nArray in descending order");
        for (int i=0; i<numbers.length; i++){
            System.out.printf("%d%s ", numbers[i], i==numbers.length-1? "":",");
        }
        System.out.print("\nEnter a number to search: ");
        int key = input.nextInt();
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key)System.out.printf("%d found\nLinear Search - %d loop(s)\n", key, i+1);
        }
        int low=0, high=numbers.length-1, middle;
        int count = 0;
        while (low <= high){
            middle = (low+high)/2;
            if (key == numbers[middle]){
                System.out.printf("%d found\nBinary Search - %d loop(s)\n", key, count+1);
                break;
            }else if(key>numbers[middle]){
                high = middle-1;
            }else{
                low = middle+1;
            }
            count++;
        }
        //In most cases, binary search is faster than linear search.  
        
        //6.
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        n = input.nextInt();
        int [][] pascal = new int [n][n];
        for(int i=0; i<pascal.length-1; i++){
            for(int j=i+1; j<pascal[i].length; j++){
                pascal[i][j]=0;
            }
        }
        for (int[] pascal1 : pascal) {
            pascal1[0] = 1;
        }
        for(int i=1; i<pascal.length; i++){
            for(int j=1; j<i+1; j++){
            pascal[i][j]= pascal[i-1][j]+pascal[i-1][j-1];
            }
        }
        System.out.printf("The Pascal Triangle with %d row(s)\n", n);
        for (int[] pascal1 : pascal) {
            for (int j = 0; j < pascal1.length; j++) {
                System.out.printf("%5d", pascal1[j]);
            }
            System.out.println("");
        }
        
        //6. alternate more efficient answer
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        n = input.nextInt();
        int [][] pascal2 = new int [n][n];
        for (int i=0; i<pascal2.length; i++){
            for (int j=0; j<pascal2[i].length; j++){
                if (j==0|| j==i){
                    pascal2[i][j] = 1;
                }else if(i==0){
                    pascal2[i][j] = 0;
                }else{
                    pascal2[i][j]= pascal2[i-1][j]+pascal2[i-1][j-1];
                }
            }
        }
        System.out.printf("The Pascal Triangle with %d row(s)\n", n);
        for (int[] pascal1 : pascal2) {
            for (int j = 0; j < pascal1.length; j++) {
                System.out.printf("%5d", pascal1[j]);
            }
            System.out.println("");
        }
    }
}
