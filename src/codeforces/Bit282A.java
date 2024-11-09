package codeforces;

import java.util.Scanner;

public class Bit282A {
    public static void main(String[] args) {
        int x=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String input = sc.next().trim();

            if(input.charAt(0) == '+' || input.charAt(1) == '+'){
                x=x+1;
            }else{
                x=x-1;
            }
        }
        System.out.println(x);
    }
}
