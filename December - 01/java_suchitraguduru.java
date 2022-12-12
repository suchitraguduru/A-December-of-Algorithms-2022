
import java.util.Scanner;

public class java_suchitraguduru {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int t=s1.nextInt();
        while(t-->0){
            int n = s1.nextInt();
            int[] arr = new int[n];
            String str = new String("");
            for(int i=0;i<n;i++){
                String ss = s1.next();
                arr[i] = Integer.parseInt(ss,16);
                str+=(char)arr[i];
            }
            System.out.println(str);
        }
    }
}
