class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums2.length; i++){
            map.put(nums2[i],i);
        }

        for(int i = 0; i < nums1.length; i++){
            int index = map.get(nums1[i]);
            int curr = nums1[i];
            
            for(int j = index; j < nums2.length; j++){
                
                if(j == nums2.length - 1){
                    res[i] = -1;
                    break;
                }
                if(curr < nums2[j+1]){
                    res[i] = nums2[j+1];
                    break;
                }
            }
        }
        return res;
    }
}