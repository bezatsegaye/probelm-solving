import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class Removeduplicatesfromanarray {

    public static Set<Integer> RemoveDuplicate (int [] arr){
        Set<Integer> st = new HashSet<>();
        for(int i=0; i< arr.length; i++) {
            st.add(arr[i]);
        }
        return st;
    }
    public static void main(String[] args) {
    System.out.println(Removeduplicatesfromanarray.RemoveDuplicate(
<<<<<<< HEAD
            new int [] {1,1,2,3,3,4,5,5,5}));
=======
            new int [] {1,1,2,3,3,4,5}));
>>>>>>> dev
    }
}

