public class Solution {
    public String reverseWords(String s) {
    	StringBuffer sb = new StringBuffer();
    	String[] ss = s.split(" ");
    	int index = 0;
    	for (int i = 0; i < ss.length; i++) {
    		if (ss[i].trim().length() != 0){
    			index = i;
    			break;
    		}
		}
        for (int i = ss.length - 1; i >= 0; i--) {
			if (ss[i].trim().length() != 0) sb.append(ss[i] + (i == index ? "" : " "));
		}
        return sb.toString();
    }
}