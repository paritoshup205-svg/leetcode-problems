class Solution {
    public int findGCD(int[] nums) {
        int mn = Integer.MAX_VALUE;
        int mx = 0;
        int num = 1;
        for(int i=0;i<nums.length;i++){
            if(mn>nums[i]) mn=nums[i];
             if(mx<nums[i]) mx=nums[i];
        }
        for (int i = 1; i <= mn; i++) {
            if (mn % i == 0 && mx % i == 0)
                num= i;
        }

        return num;
    }
}