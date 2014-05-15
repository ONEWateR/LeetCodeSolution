import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
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
    
    public static void main(String[] args) {
		int[] A = {1,2,3,1,2,8,9,8,3};
		System.out.println(new SingleNumber().singleNumber(A));
	}
}
