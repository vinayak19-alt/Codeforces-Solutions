package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Twin160A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int sum=0;
        int totalSum=0;
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            totalSum += arr[i];
        }
        Arrays.sort(arr);
        reverseArray(arr);

        for(int coin : arr){
            sum += coin;
            count++;
            if(sum > totalSum/2){
                break;
            }
        }
        System.out.println(count);
    }
    public static void reverseArray(int[] arr){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
