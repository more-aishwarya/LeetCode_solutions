class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int str1len = str1.length();
        int str2len = str2.length();
        String result ="";


        for (int i=1 ; i<= Math.min(str1len,str2len) ; i++){
            if (str1len % i ==0 && str2len % i ==0 
           && str1.substring(0, i).repeat(str1len / i).equals(str1)
                && str1.substring(0, i).repeat(str2len / i).equals(str2)) {
                result = str1.substring(0, i);
        }
        }
    
     return result;
    }
    }
