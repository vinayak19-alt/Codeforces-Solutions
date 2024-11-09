package solace;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking the number of rows and columns as input
        System.out.println("Enter the dimensions of the matrix(value of n):");
        int n = sc.nextInt();
        System.out.println("Enter the values in matrix:");
        int[][] matrix = new int[n][n];
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        rotate(matrix);
        for(int[] row: matrix){
            System.out.println(Arrays.toString(row));
        }
    }
    public static void rotate(int[][] matrix){
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp= matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp=matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
}
