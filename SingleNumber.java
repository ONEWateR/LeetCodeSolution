import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int singleNumber(int[] A) {
    	Map<Integer, Character> map = new HashMap<Integer, Character>();
    	for (int a : A) {
			if (map.containsKey(a)) 
				map.put(a, '1');
			else
				map.put(a, '0');
		}
    	for (int key : map.keySet()) {
			if (map.get(key) == '0') return key;
		}
        return 0;
    }
}
