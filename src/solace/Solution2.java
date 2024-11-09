package solace;

import java.util.HashMap;
import java.util.Scanner;

public class Solution2 {
    private static final int MOD = 998244353;
    public static int count(String s){
        int n = s.length();
        long[] dp = new long[n+1];
        dp[0]= 1;

        HashMap<Character, Integer> lastSeen = new HashMap<>();
        for(int i=0; i<n; i++){
            dp[i+1] = (2 * dp[i])%MOD;
            char c = s.charAt(i);
            if (lastSeen.containsKey(c)) {
                int j= lastSeen.get(c);
                dp[i+1]=(dp[i+1]-dp[j] + MOD) % MOD;
            }
            lastSeen.put(c, i);
        }
        return (int)((dp[n]-1 + MOD)%MOD);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        System.out.println(count(s));
    }
}
