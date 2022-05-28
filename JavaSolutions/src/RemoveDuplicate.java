import java.util.Arrays;

public class RemoveDuplicate {
    public static char [] removeDuplicates(char[] str) {
        if (str == null) return null;
        int len = str.length;
        if (len < 2) return null;

        int tail = 1;

        for (int i = 1; i < len; ++i) {
            int j;
            for (j = 0; j < tail; ++j) {
                if (str[i] == str[j]) break;
            }
            if (j == tail) {
                str[tail] = str[i];
                ++tail;
            }
        }
        str[tail] = 0;
        return Arrays.copyOf(str, tail);
    }

    public static void main(String[] args) {
System.out.println(RemoveDuplicate
        .removeDuplicates(new char[]{'a','b','b','b','c','c','a','b'}));
    }
}