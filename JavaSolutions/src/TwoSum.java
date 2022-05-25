import java.util.*;

public class TwoSum {

    public static int[] twosum(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<array.length; i++){
            int sub = target - array[i];
            if(map.containsKey(sub)) {
                return new int[] {map.get(sub),i};
            } else {
                map.put(array[i], i);
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(TwoSum.twosum(new int [] {1,2,3,4,5}, 5)));
    }
}
