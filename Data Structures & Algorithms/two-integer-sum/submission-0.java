class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int required = target - nums[i];

            if(map.containsKey(required)){
                int j = map.get(required);
                ans[0] = Math.min(i, j);
                ans[1] = Math.max(i, j);

                return ans;
            }

            map.put(nums[i], i);
        }

        return ans;
    }
}
