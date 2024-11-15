public class Subsets {
    // static ArrayList<String> arr=new ArrayList<>();
    public static void SubsetsPrint(int i, String s, String ans){
        if(i==s.length()){
            System.out.println(ans); //instead of this we can do this also
            // arr.add(ans);
            return;
        }
        char ch=s.charAt(i);
        SubsetsPrint(i+1, s, ans+ch);
        SubsetsPrint(i+1, s, ans);
    }
    public static void main(String args[]){
        String s="abc";
        SubsetsPrint(0, s, "");
        // System.out.print(arr);
    }
}
