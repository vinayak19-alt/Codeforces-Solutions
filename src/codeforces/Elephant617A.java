package codeforces;

import java.util.Scanner;

public class Elephant617A {
    public static void main(String[] args) {
        int count=0;
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 5 == 0){
            System.out.println((n/5));
        }else{
            System.out.println((n/5)+1);
        }
    }
}
