class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            // If current number is already in the window
            if (set.contains(nums[i])) {
                return true;
            }

            // Add current number to the window
            set.add(nums[i]);

            // Keep only k previous elements in the window
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}