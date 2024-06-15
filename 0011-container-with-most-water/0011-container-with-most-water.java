class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea=0, containerArea=0;
        while(left<right){
            if(height[left]<height[right]){
                containerArea = height[left]*(right-left);
                left++;
            }
            else {
                containerArea = height[right]*(right-left);
                right--;
            }
            maxArea = Math.max(containerArea, maxArea);
        }
        return maxArea;
    }
}