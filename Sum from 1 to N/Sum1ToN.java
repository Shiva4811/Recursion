import java.util.Scanner;
class Sum1ToN{
    public static int sum(int n){
        if(n==1) return n;
        int result=n+sum(n-1);
        return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
}