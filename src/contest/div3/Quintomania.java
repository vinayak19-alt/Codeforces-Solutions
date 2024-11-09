package contest.div3;

import java.util.Scanner;

public class Quintomania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int num=sc.nextInt();
            int[] arr = new int[num];
            for(int j=0; j<num; j++){
                arr[j]=sc.nextInt();
            }
            boolean isPerfect = true;
            for(int k=0; k<arr.length-1; k++){
                if(Math.abs(arr[k] - arr[k+1]) != 5 && (Math.abs(arr[k] - arr[k+1]) != 7)){
                    isPerfect=false;
                    break;
                }
            }
            if(isPerfect){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
