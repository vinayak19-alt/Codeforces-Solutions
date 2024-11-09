package codeforces;

import java.util.Scanner;

public class Football96A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next().trim();
        boolean isDangerous=false;
        int count=1;
        char prev = input.charAt(0);
        for(int i=1; i<input.length(); i++){
            char curr = input.charAt(i);
            if(prev == curr){
                count++;
                if(count == 7){
                    isDangerous=true;
                    break;
                }
            }else{
                count=1;
                prev=curr;
            }
        }
        if(isDangerous){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
