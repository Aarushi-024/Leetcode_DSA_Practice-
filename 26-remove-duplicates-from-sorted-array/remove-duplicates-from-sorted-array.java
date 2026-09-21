class Solution {
    public int removeDuplicates(int[] nums) {
        int start = 0;
        int first = 1;
        int second = 1;
        while(second < nums.length){
            if(nums[second] == nums[second - 1]){
                second++;
            }else{ //case of unique values 
                nums[start + 1] = nums[second];
                start++;
                first++;
                second++;

            }
        }
        return first;

        
    }
}