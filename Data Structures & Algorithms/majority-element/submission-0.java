class Solution {
    public int majorityElement(int[] nums) {
        int half = nums.length / 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        Integer maxKey = Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey();

        return maxKey;
    }
}