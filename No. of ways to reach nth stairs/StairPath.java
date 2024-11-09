import java.util.Scanner;
public class StairPath {
    public static int stairs(int n){
        if(n<=2) return n;
        return stairs(n-1) + stairs(n-2);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("The number of ways to reach nth stairs is "+stairs(n));

    }
}
