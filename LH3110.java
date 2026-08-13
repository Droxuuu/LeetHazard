class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        char c[]=s.toCharArray();
        int p1=0,p2=c.length-1;
        while(p1<p2)
        {
            sum=sum+Math.abs((int)c[p1+1]-(int)c[p1]);
            p1++;
        }
        return sum;
    }
}