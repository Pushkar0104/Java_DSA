static class Solution {
    public int largestElement(int[] nums) {
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(max > nums[i]){
                max = max;
            }
            else if(max < nums[i]){
                max = nums[i];
            }
            else{
                max = nums[i];
            }
        }
        return max;

    }
}

public static void main(String[] args) {
    Solution sol = new Solution();
    int[] nums = {4,9,3,5,5,2,9,7};
    int result = sol.largestElement(nums);
    System.out.println("The largest element is: " + result);
    
}