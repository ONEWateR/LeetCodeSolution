public class Solution {
	public Map<Integer, Integer> map = new HashMap<Integer, Integer>(){
		{
			put(0, 1);
		}
	};
    public int numTrees(int n) {
    	int total = 0;
    	if (!map.containsKey(n)){
    		for (int i = 0; i < n; i++) {
				total += numTrees(i) * numTrees(n - 1 - i);
			}
    		map.put(n, total);
    	}
        return map.get(n);
    }
}
