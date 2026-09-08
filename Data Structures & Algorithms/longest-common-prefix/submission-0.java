class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder("");
        boolean finished = false;
        
        for (int i=0; i<strs[0].length(); i++) {
            char ch = strs[0].charAt(i);

            for (int j=1; j<strs.length; j++) {
                if (i >= strs[j].length() || ch != strs[j].charAt(i)) {
                    finished = true;
                    break;
                }
            }

            if (finished) {
                break;
            } else {
                prefix.append(ch);
            }
        }

        return prefix.toString();
    }
}