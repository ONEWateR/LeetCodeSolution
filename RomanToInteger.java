public class Solution {
	public Map<Character, Integer> map = new HashMap<Character, Integer>(){
		{
			put('I', 1);
			put('V', 5);
			put('X', 10);
			put('L', 50);
			put('C', 100);
			put('D', 500);
			put('M', 1000);
		}
	}; 
	
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
        	if (i != s.length() -1 && map.get(s.charAt(i + 1)) > map.get(s.charAt(i))){
        		result += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
        		i++;
        	}else{
        		result += map.get(s.charAt(i));
        	}
		}
        return result;
    }
}