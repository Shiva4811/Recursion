import java.util.Scanner;
class GreatestCommonDivisor{
    public static int gcd(int a, int b){
        if(b%a==0) return a;
        return gcd(b%a, a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b=sc.nextInt();
        System.out.print("The GCD of the two numbers is: "+gcd(a, b));
    }
}