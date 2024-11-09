package codeforces;

import java.util.Scanner;

public class LongWords71A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] input = new String[n];
        for(int i=0; i<n; i++){
            input[i] = sc.next().trim();
        }
        for(int i=0; i< input.length; i++){
            String output="";
            if(input[i].length() <= 10){
                output = input[i];
            }else{
                int letterCount= input[i].length() - 2;
                String numberStr = Integer.toString(letterCount);
                output = input[i].charAt(0) + numberStr + input[i].charAt(input[i].length()-1);
            }
            System.out.println(output);
        }
    }
}
