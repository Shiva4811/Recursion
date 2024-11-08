import java.util.Scanner;
class PrintIncreasing{
    public static void print(int n, int x){
        if(x==n+1) return;
        System.out.println(x);
        print(n, x+1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();
        int x=1;
        print(n,x);
    }
}