package contest.div3;

import java.util.Scanner;

public class AnyaAnd1100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0; i<t; i++){
            String num = sc.next().trim();
            StringBuilder sb = new StringBuilder(num);
            int query = sc.nextInt();
            boolean res = sb.toString().contains("1100");
            for(int j=0; j<query; j++){
                int i1=sc.nextInt();
                int v= sc.nextInt();
                char newChar = (v == 1) ? '1':'0';
                if(i1 < sb.length()){
                    if(sb.charAt(i1-1) != newChar){
                        sb.setCharAt(i1-1, newChar);
                    }
                    res = sb.toString().contains("1100");
                }
                if(res){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
