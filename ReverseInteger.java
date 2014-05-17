public class Solution {
    public int reverse(int x) {
        String s = Integer.toString(x);
        StringBuffer sb = new StringBuffer();
        Stack<Character> sk = new Stack<Character>();
        int negative = 1;
        boolean zero = false;
        for (int i = 0; i < s.length(); i++) {
        	if (s.charAt(i) == '-') negative = -1;
        	else sk.add(s.charAt(i));
		}
        while (!sk.isEmpty()) {
        	char c = sk.pop();
        	if (!zero && c == '0') continue;
			if (c != '0') zero = true;
			sb.append(c);
		}
        try {
        	return Integer.parseInt(sb.toString()) * negative;
		} catch (Exception e) {
			return 0;
		}
    }
}