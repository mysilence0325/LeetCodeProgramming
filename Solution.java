public class Solution {
    /**
     * 283
     * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        if (nums == null) return;
        int k = 0, index = 0;
        for (; index < nums.length; index++) {
            if (nums[index] != 0) {
                if (index != k) {
                    nums[k] = nums[index];
                }
                k++;
            }
        }
        for (index = k; index < nums.length; index++) {
            nums[index] = 0;
        }
    }

    /**
     * 27
     * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
     * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
     *
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int num : nums) {
            if (num == val) continue;
            nums[index++] = num;
        }
        return index;
    }

    /**
     * 26
     * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory
     */
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int num : nums) {
            if (index < 1 || num > nums[index - 1]) {
                nums[index++] = num;
            }
        }
        return index;
    }

    /**
     * 80
     * Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory
     *
     * @param nums
     * @return
     */
    public int removeDuplicates2(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i - 2])
                nums[i++] = n;
        return i;
    }

}
