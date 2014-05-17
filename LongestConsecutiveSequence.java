public class Solution {
	enum Direction {
		Increase,Reduce
	}
    public int longestConsecutive(int[] num) {
    	Map<Integer,Integer> hash = new HashMap<Integer, Integer>();
        for (int i : num) {
        	hash.put(i, 0);
		}
        int longest = 0;
        for (int i : num) {
        	int lenght = getConsecutiveLenght(i, hash, Direction.Increase) + getConsecutiveLenght(i - 1, hash, Direction.Reduce);
        	if (lenght > longest)
        		longest = lenght;
		}
        return longest;
    }
    
    public int getConsecutiveLenght(int i, Map<Integer,Integer> hash, Direction d) {
		int num = 0;
		int key = i;
		while (hash.containsKey(key)) {
			num++;
			hash.remove(key);
			if (d == Direction.Increase){
				key++;
			}else{
				key--;
			}
		}
		return num;
	}
}