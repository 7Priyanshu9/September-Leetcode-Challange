// Given an array of distinct integers nums and a target integer target, return the number of possible combinations that add up to target.

// The test cases are generated so that the answer can fit in a 32-bit integer

public class Day9 {
   
        public static int combinationSum4(int[] nums, int target) {
            // Initialize an array to store the number of combinations for each sum from 0 to the target.
            int[] dp = new int[target + 1];
            
            // There is one way to reach the sum of 0 (no elements chosen).
            dp[0] = 1;
            
            // Iterate through all sums from 1 to the target.
            for (int i = 1; i <= target; i++) {
                // For each sum i, try using each element in nums to form the sum.
                for (int num : nums) {
                    if (i >= num) {
                        dp[i] += dp[i - num];
                    }
                }
            }
            
            
            return dp[target];
        }
    
        public static void main(String[] args) {
            int[] nums = {1, 2, 3};
            int target = 4;
            int result = combinationSum4(nums, target);
            System.out.println(result); // Output: 7 (Combinations: [1,1,1,1], [1,1,2], [1,2,1], [2,1,1], [2,2], [1,3], [3,1])
        }
    }

