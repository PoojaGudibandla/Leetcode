class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0,j=0;
        double avg=0, maxAvg =-1111, sum=0;
        for( i=0;i<k;i++){
            sum+=nums[i];
        }
        maxAvg = sum/k;
        for(j=i;j<nums.length;j++){
            sum+=nums[j];
            sum-=nums[j-k];
            avg = sum/k;
            maxAvg=Math.max(avg,maxAvg);
        }
        return maxAvg;
    }
}