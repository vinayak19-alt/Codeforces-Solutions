package contest.div3;

import java.util.Scanner;

public class Startup {
    public static void main(String[] args) {
        int sum=0;
        int max=0;
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            for(int j=0; j<k ;j++){
                int brand = sc.nextInt();
                int cost = sc.nextInt();
                if(n-k>=0){
                    sum+=cost;
                }else{
                    sum=0;
                    sum = Math.max(sum, cost);
                }
            }
            System.out.println(sum);
        }
    }
}
