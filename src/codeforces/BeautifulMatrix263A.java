package codeforces;

import java.util.Scanner;

public class BeautifulMatrix263A {
    public static void main(String[] args) {
        int ans=0;
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        for(int i=0; i<5;i++){
            for(int j=0; j<5; j++){
                matrix[i][j]=sc.nextInt();
                if(matrix[i][j] == 1){
                    ans = Math.abs(i-2) + Math.abs(j-2);
                }
            }
        }
        System.out.println(ans);
    }
}
