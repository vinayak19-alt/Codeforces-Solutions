package codeforces;

import java.util.Scanner;

public class BearAndBigBrother791A {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a<=b){
            a = a*3;
            b= b*2;
            count++;
        }
        System.out.println(count);
    }
}
