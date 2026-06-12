class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];

        Arrays.fill(ans, -1);

        int len = 2 * k + 1;
        if (len > n) return ans;

        long sum = 0;

        for (int i = 0; i < len; i++) {
            sum += nums[i];
        }

        ans[k] = (int)(sum / len);

        for (int i = len; i < n; i++) {
            sum += nums[i];
            sum -= nums[i - len];

            ans[i - k] = (int)(sum / len);
        }

        return ans;
        
        
    }

    }