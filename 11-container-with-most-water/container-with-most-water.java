class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxarea = 0;
        while(i<j){
        int maxHeight = Math.min(height[i], height[j]);
        int maxWidth = j - i;
         int  currentarea = maxHeight*maxWidth;
        if(currentarea > maxarea){
            maxarea = currentarea;
        }
        
        if(height[i] < height[j]){
             int hLeft = height[i];
             while(i < j && height[i] <= hLeft) {
            i++;
             }
        }else{

                int hRight = height[j];

                while(i < j && height[j] <= hRight) {
                    j--;
                }

        }
        
        
        }
        return maxarea;

    }
    
}