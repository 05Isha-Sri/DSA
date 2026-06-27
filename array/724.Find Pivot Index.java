class Solution {
    public int pivotIndex(int[] nums) {
        int rightsum = 0, leftsum = 0, totalsum = 0;

        for(int i = 0; i < nums.length; i++){
            totalsum += nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            rightsum = totalsum - nums[i] - leftsum;
            if(leftsum == rightsum) return i;
            leftsum = leftsum + nums[i];
        }
        return -1;
    }
}