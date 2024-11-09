package codeforces;

import java.util.Scanner;

public class Team231A {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int p =sc.nextInt();
            int v = sc.nextInt();
            int t = sc.nextInt();

            if(p + v + t >=2){
                count++;
            }
        }
        System.out.println(count);
    }
}
