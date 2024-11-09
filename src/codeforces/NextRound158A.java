package codeforces;

import java.util.Scanner;

public class NextRound158A {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int threshold = arr[k-1];
        for(int i=0; i<n; i++){
            if(arr[i] >= threshold && arr[i] > 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
