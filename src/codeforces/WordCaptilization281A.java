package codeforces;

import java.util.Scanner;

public class WordCaptilization281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input.substring(0, 1).toUpperCase() + input.substring(1));
    }
}
