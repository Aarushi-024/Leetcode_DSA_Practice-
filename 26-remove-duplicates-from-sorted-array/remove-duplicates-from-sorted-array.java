class Solution {
    public int removeDuplicates(int[] nums) {

    int dup = 0;
    for(int i = 0; i < nums.length; i++){
        if(nums[i] != nums[dup]){
            dup++;
            nums[dup] = nums[i];

        }
    }
    return dup + 1;
    }
    }