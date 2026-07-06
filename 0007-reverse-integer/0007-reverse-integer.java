class Solution {
    public int reverse(int x) {
        long rev=0;
        while(x!=0){
            int ld = x%10;
            rev*=10;
            rev+=ld;
            x/=10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
    return 0;
} else return (int) rev;
    }
}