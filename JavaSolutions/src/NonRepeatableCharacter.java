import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonRepeatableCharacter {
    public static char firstNonRepeatingChar(String word) {
        Set<Character> st = new HashSet<>();
        List<Character> li = new ArrayList<>();
        for (int i=0; i<word.length(); i++) {
            char letter = word.charAt(i);
            if(st.contains(letter))
                continue;
             if(li.contains(letter)) {
                li.remove((Character) letter);
                st.add(letter);
            } else {
                 li.add(letter);
             }
        }
        return li.get(0);
    }

    public static void main(String[] args){
        System.out.println(NonRepeatableCharacter.firstNonRepeatingChar("TsegayeTsgay"));
    }
}
