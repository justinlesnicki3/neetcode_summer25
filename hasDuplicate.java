class Solution {
    public boolean hasDuplicate(int[] nums) {

        boolean answer = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }

        return answer;

    }
}