//Perfect paranthesis i.e, (), (()), ()(), ((())) etc. number of closing brackets must be equal to opening brackets and closing brackets must be applied if closing brackets is less than opening brackets
// Non Perfect paranthesis i.e, )()(,(()()(
import java.util.Scanner;
public class GeneratePerfectParanthesis {
    public static void printParanthesis(int open, int close, String s, int n){
        if(s.length()==2*n){
            System.out.println(s);
            return;
        }
        if(open<n) printParanthesis(open+1, close, s+"(", n);
        if(close<open) printParanthesis(open, close+1, s+")", n);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        printParanthesis(0, 0, "",n);
    }
}
