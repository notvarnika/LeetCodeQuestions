class Solution {
    public long countOperationsToEmptyArray(int[] nums) {
        Integer[] idx = new Integer[nums.length];
        for (int i =0;i<nums.length;i++){
            idx[i]=i;
        }
        Arrays.sort(idx,(a,b)->Integer.compare(nums[a], nums[b]));
        long op =nums.length;
        for (int i =1;i<nums.length;i++){
            if(idx[i]<idx[i-1]){
                op +=(nums.length-i);
            }
        }
        return op;
    }
}