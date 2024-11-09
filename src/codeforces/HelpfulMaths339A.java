package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] arr = input.split("\\+");
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]);
            if(i != arr.length-1){
                sb.append("+");
            }
        }
        System.out.println(sb.toString());
    }
}
