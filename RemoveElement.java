public class Solution {
    public int removeElement(int[] A, int elem) {
		int[] copy = A.clone();
		int flag = 0;
		for(int i = 0; i< A.length; i++){
            if (A[i] == elem) {
            	flag++;
            }else{
            	A[i - flag] = A[i];
            }
        }
        return A.length - flag;
    }
}
