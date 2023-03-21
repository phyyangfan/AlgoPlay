package common.sample;

public class QuickSort {
    public void sort(int[] nums) {
        sort(nums, 0, nums.length-1);
    }

    private void sort(int[] nums, int l, int r) {
        if (r <= l) return;
        int l0 = l, r0 = r;
        int pv = nums[l];
        while (true) {
            while (l < r && pv <= nums[r]) r--;
            if (l == r) break;
            nums[l++] = nums[r];
            while (l < r && nums[l] <= pv) l++;
            if (l == r) break;
            nums[r--] = nums[l];
        }
        nums[l] = pv;
        sort(nums, l0, l-1);
        sort(nums, l+1, r0);
    }
}
