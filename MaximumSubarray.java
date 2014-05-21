public class Solution {
    public int maxSubArray(int[] A) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i : A) {
			sum += i;
			if (sum > max) max = sum;
			if (sum < 0) sum = 0;
		}
        return max;
    }
}
