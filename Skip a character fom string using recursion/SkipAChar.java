import java.util.Scanner;
class SkipAChar{
    public static void print(int i, String str, char ch, String ans){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        if(str.charAt(i)!=ch) ans+=str.charAt(i);
        print(i+1, str, ch, ans);
    }
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print("Enter a character you want to remove from the string: ");
        char ch=sc.next().charAt(0);
        print(0, str, ch, "");
    }
}