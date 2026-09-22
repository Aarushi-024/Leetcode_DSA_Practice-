class Solution {
    public int singleNumber(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>(); //create
        // for(int num : nums){ 
        //     map.put(num, map.getOrDefault(num, 0) + 1);

        // }
        // for (int num : nums){
        //     if(map.get(num) == 1){
        //         return num;
        //     }
        // }
        // return -1;
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];

        }
        return xor;

    }
}