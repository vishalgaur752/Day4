public class RearrangeArraysElement {
    public static void rearrangearray(int nums[]) {
        int[] ans = new int[nums.length];
        int pos = 0, neg = 1;
        for(int i : nums) {
            if(i > 0) {
                ans[pos] = i;
                pos += 2;
            } else {
                ans[neg] = i;
                neg += 2;
            }
        }
        for(int i=0; i<ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
   
    public static void main(String[] args) {
        int nums[] = {3, 1, -2, -5, 2, -4};
        rearrangearray(nums);
    }
}
