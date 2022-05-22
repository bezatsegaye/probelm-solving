import com.sun.source.doctree.SystemPropertyTree;

public class Palindrome {
    public static boolean getPalindrome(String val) {
        int i=0;
        int j= val.length()-1;
        while(i < j) {
            if (val.charAt(i) != val.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        if(Palindrome.getPalindrome("pg")){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}