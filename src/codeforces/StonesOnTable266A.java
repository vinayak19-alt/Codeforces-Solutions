package codeforces;

import java.util.Scanner;

public class StonesOnTable266A {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next().trim();
        for(int i=0; i<n-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }
        }
        System.out.println(count);
    }
}
