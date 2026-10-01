class Solution {
    public void moveZeroes(int[] nums) {

        int insertPos = 0;
        int n = nums.length;
        
        for (int j = 0; j < n; j++) {
            if (nums[j] != 0) {
                int temp = nums[j];
                nums[j] = nums[insertPos];
                nums[insertPos] = temp;
                
                insertPos++;
            }
        }
        
    }
}