public class Solution {
	public Map<Integer, Integer> map = new HashMap<Integer, Integer>(){{
		put(1, 1);
		put(2, 2);
	}};
    public int climbStairs(int n) {
    	if (!map.containsKey(n)) 
    		map.put(n, climbStairs(n - 1) + climbStairs(n - 2));
        return map.get(n);
    }
}