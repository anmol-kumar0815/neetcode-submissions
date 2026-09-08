class Solution {
  public int findLastSafeIndex(int startIndex, int[] ary, int number) {
    for (int i=startIndex; i>=0; i--){
      if (ary[i] != number) return i;
    }

    return -1;
  }

  public int removeElement(int[] nums, int val) {
    int safeIndex = findLastSafeIndex(nums.length - 1, nums, val);

    for (int i=0; i<safeIndex; i++) {
      if (nums[i] == val) {
        int temp = nums[i];
        nums[i] = nums[safeIndex];
        nums[safeIndex] = temp;

        safeIndex = findLastSafeIndex(safeIndex-1, nums, val);
      }
    }

    return safeIndex + 1;
  }
}