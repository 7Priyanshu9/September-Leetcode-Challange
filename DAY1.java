// Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

 class Solution {
    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];

    

    for (int i = 1; i <= n; i++) {

        // To calculate the number of 1's in binary representation of i,

        // we can use the following recurrence relation:

        // ans[i] = ans[i / 2] + (i % 2);

        ans[i] = ans[i >> 1] + (i & 1);

    }

    

    return ans;
    }
    public static void main(String[] args) {
        int num = 7;
        int ans[] = countBits(num);

        for(int p : ans){
            System.out.print(p);
        }
    }
}
// new text adding for checking
