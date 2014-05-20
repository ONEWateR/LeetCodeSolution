public class Solution {
    public int searchInsert(int[] A, int target) {
        int index = 0;
        for (int i = 0; i < A.length; i++) {
        	if (i == 0 && A[i] > target) return 0;
			if (A[i] == target) {
				return i;
			}else if (A[i] < target) {
				index = i;
			}else{
				break;
			}
		}
        return index + 1;
    }
}
