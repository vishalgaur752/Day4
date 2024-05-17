public class SortColors {
    public static void sortColor(int nums[]) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;
        while (mid <= end) {
            if (nums[mid] == 0) {
                swap(nums, start++, mid++);
            } else if (nums[mid] == 2) {
                swap(nums, mid, end--);
            } else {
                mid++;
            }
        }
    }

    public static void swap(int nums[], int pos1, int pos2) {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }

    public static void printArr(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = { 2, 0, 2, 1, 1, 0, 1, 0, 1, 0 };
        sortColor(nums);
        printArr(nums);
    }
}
