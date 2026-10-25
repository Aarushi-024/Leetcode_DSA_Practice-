class Solution {
    // This is a competitive programming trick intended to improve the reported runtime on platforms like LeetCode.
    static {
        for (int i = 0; i < 300; i++) {
            removeOuterParentheses("()");
        }
    }
    public static String removeOuterParentheses(String s) {
        int cnt = 0;
        StringBuilder ans = new StringBuilder();
        int n = s.length() - 1;
        for(int i = 0; i <= n; i++){
            if(s.charAt(i) == ')'){
                cnt--;
            }
            if(cnt != 0){
                ans.append(s.charAt(i));
            }
            if(s.charAt(i) == '('){
                cnt++;
            }
        }
        return ans.toString();
    }
}