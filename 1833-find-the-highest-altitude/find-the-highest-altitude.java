class Solution {
    public int largestAltitude(int[] gain) {
        int res =0;
        int high=0;
        for (int i:gain)
    {
        high=Math.max(high,res +i);
        res =res+i;
    }
    return high;
    }
}