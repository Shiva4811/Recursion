import java.util.Scanner;
public class PowerLinear {
    public static int Pow(int n, int i){
        if(i==0) return 1;
        int x=n*Pow(n, i-1);
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.print("Enter the value of i (power): ");
        int i=sc.nextInt();
        System.out.println(Pow(n, i));
    }
}
