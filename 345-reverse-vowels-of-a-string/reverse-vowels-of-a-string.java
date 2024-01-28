class Solution {
    public String reverseVowels(String s) {
        char[] chars =s.toCharArray();
        int left =0 ,right =chars.length-1;
        String vovels ="aeiouAEIOU";


        while (left<right){
            while(left <right && !vovels.contains(chars[left]+""))
            left ++;
            while(left <right && !vovels.contains(chars[right]+""))
            right--;

            if (left<right){
                char temp=chars[left];
                chars[left++] = chars[right];
                chars[right--]=temp;
            }
           
        }
        return new String (chars);
    }
    
}