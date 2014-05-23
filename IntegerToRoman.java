import java.util.LinkedHashMap;
public class Solution {
    public LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>(){
        {
            put(1000, "M");
            put(900, "CM");
            put(500, "D");
            put(400, "CD");
            put(100, "C");
            put(90, "XC");
            put(50, "L");
            put(40, "XL");
            put(10, "X");
            put(9, "IX");
            put(5, "V");
            put(4, "IV");
            put(1, "I");
        }
    }; 
	public String intToRoman(int num) {
		 for (Integer i : map.keySet()) {
	         if (num >= i) {
	             return map.get(i) + intToRoman(num - i);
	         }
	     }
		 return "";
	}
}
