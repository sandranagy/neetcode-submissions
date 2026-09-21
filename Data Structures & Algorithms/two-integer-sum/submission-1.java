class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ind = new int[2]; 
    for(int z=0;z<nums.length;z++){
    for(int l=z+1;l<nums.length;l++){
       if(nums[z]+nums[l]==target){
        ind[0]=z;
        ind[1]=l;
        return ind;
       } 
    }
    }
    return null; 
}
}
