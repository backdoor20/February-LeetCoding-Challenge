class Solution {
    public int maxArea(int[] height) {
        int maxiumArea = 0;
        int len=height.length-1;
        int left=0;
        while(left<len){
            int min=Math.min(height[left],height[len]);
            int area=min*(len-left);
            if(maxiumArea<area){
                maxiumArea=area;
            }
            if(min==height[left])
                left++;
            else
                len--;
        }
        return maxiumArea;
    }
}