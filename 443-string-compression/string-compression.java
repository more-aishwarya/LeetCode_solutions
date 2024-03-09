class Solution {
    public int compress(char[] chars) {
        int index = 0; 
    int count = 1; 
    
    for (int i = 1; i <= chars.length; i++) {
        if (i < chars.length && chars[i] == chars[i - 1]) {
            count++; 
        } else {
            chars[index++] = chars[i - 1]; 
            
            if (count > 1) {
                String countStr = String.valueOf(count); 
                for (char c : countStr.toCharArray()) {
                    chars[index++] = c; 
                }
            }
            
            count = 1; 
        }
    }
    
    return index; 
    }
}