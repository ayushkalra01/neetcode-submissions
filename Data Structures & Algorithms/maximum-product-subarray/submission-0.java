class Solution {
    public int maxProduct(int[] nums) {

        int maxEndingHere = nums[0];
        int minEndingHere = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int curr = nums[i];

            // Store because maxEndingHere changes
            int tempMax = maxEndingHere;

            maxEndingHere = Math.max(
                    curr,
                    Math.max(curr * maxEndingHere, curr * minEndingHere)
            );

            minEndingHere = Math.min(
                    curr,
                    Math.min(curr * tempMax, curr * minEndingHere)
            );

            ans = Math.max(ans, maxEndingHere);
        }

        return ans;
    }
}