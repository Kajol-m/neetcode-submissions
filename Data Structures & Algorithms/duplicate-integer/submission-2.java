class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hset=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!hset.contains(nums[i])){
                hset.add(nums[i]);
            }
            else{
                return true;
            }
        }
        return false;
    }
}