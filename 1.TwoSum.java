class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i2};
            }else{
                map.put(tartnums[i]);
            }
        }
    }
}
