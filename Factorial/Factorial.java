import java.util.Scanner;
public class Factorial {
    public static int fact(int n){
        if(n==1) return 1;
        int ans=n*fact(n-1);
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is "+fact(n));
    }
}