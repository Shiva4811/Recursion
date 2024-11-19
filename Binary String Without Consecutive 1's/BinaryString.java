import java.util.Scanner;
public class BinaryString {
    public static void Binary(String a, int n){
        int m=a.length();
        if(m==n){
            System.out.println(a);
            return;
        }
        if(m==0 || a.charAt(m-1)=='0'){
            Binary(a+0, n);
            Binary(a+1, n);
        }
        else Binary(a+0, n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        Binary("", n);
    }
}
