import java.util.ArrayList;
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
   	    int a=0,b=0;
    	Map<Integer, Integer[]> map = new HashMap<Integer, Integer[]>();
    	for (int i = 0; i < numbers.length; i++) {
    		if (map.containsKey(numbers[i])){
    			map.put(numbers[i], new Integer[]{map.get(numbers[i])[0],i});
    		}
    		else
    			map.put(numbers[i], new Integer[]{i});
		}
    	for (int key : map.keySet()) {
    		if (target - key == key && map.get(key).length == 2){
    			a = map.get(key)[0] + 1;
    			b = map.get(key)[1] + 1;
    			break;
    		}
			if (map.containsKey(target - key)){
				a = map.get(key)[0] + 1;
				b = map.get(target - key)[0] + 1;
				break;
			}
		}
    	return new int[]{a > b ? b : a, a > b ? a : b};
    }
}