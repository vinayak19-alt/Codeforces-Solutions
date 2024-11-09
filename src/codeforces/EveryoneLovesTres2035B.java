package codeforces;

import java.util.Scanner;

public class EveryoneLovesTres2035B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();

            if(n == 1 || n == 3){
                System.out.println("-1");
            }else if(n % 2 == 0){
                for(int j=0; j<n-2; j++){
                    sb.append("3");
                }
                sb.append("66");
                System.out.println(sb.toString());
                sb.setLength(0);
            }else{
                for(int j=0; j<n-4; j++){
                    sb.append("3");
                }
                sb.append("6366");
                System.out.println(sb.toString());
                sb.setLength(0);
            }
        }
    }
}
