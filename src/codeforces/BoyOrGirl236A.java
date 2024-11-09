package codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyOrGirl236A {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.next().trim();
        char[] arr = input.toCharArray();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        if(set.size() % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
