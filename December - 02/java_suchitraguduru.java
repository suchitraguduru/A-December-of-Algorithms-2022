import java.util.Scanner;

public class java_suchitraguduru{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String str = s1.next();
        int len = str.length();
        String ns = "";
        str = str.substring(0,len-2);
        ns = str.substring(len-4,len-2);
        ns+=str.substring(0,len-4);
        System.out.println(ns);
    }
}
