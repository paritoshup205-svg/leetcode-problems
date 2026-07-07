class Solution {
    public int sumFourDivisors(int[] nums) {
        int n= nums.length;
        int ans = 0;
        for(int i=0;i<n;i++){
        int divisor=0;
        int  count=0;
            for(int j=1;j*j<=nums[i];j++){
                if(nums[i]%j==0){
                    count++;
                    divisor+=j;

                    int other = nums[i]/j;

                    if(other!=j){
                        count++;
                        divisor+=other;
                    }
                }
            } if(count==4){
                ans+=divisor;
            }
                
        } return ans;
    }
}