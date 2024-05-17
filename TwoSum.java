import java.util.*;

public class TwoSum {
    public static int[] twoSum(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int a[] = { i, j };
                    return a;
                }
            }
        }
        return null;
        
        // Optimized Approch
        // HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        // for (int i = 0; i < nums.length; i++) {
        // int req_num = target - nums[i];
        // if (hm.containsKey(req_num)) {
        // int arr[] = { hm.get(req_num), i };
        // return arr;
        // }
        // hm.put(nums[i], i);
        // }
        // return null;

    }

    public static void main(String[] args) {
        int nums[] = { 3, 4, 5, 15 };
        int target = 8;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}