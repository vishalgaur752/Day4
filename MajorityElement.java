import java.util.*;

public class MajorityElement {
    public static int majorityElem(int nums[]) {
        int majorityElement = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) > nums.length / 2) {
                majorityElement = key;
            }
        }
        return majorityElement;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElem(nums));

        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        // // if (map.containsKey(nums[i])) {
        // // map.put(nums[i], map.get(nums[i])+1);
        // // } else {
        // // map.put(nums[i], 1);
        // // }
        // map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        // }
        // for (Integer key : map.keySet()) {
        // if (map.get(key) > nums.length / 2) {
        // System.out.println(key);
        // }
        // }
    }
}
