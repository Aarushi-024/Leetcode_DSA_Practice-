class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    //function to check whether the number contains even number of digits or not
    static boolean even(int num){
//        int numberofDigits = digits(num);
//        if(numberofDigits % 2 == 0){
//            return true;
//        }
//        return false; //return numberofDigits % 2; #shortcutMethod
        int numberOfDigits = (int) Math.log10(num) + 1;
        return numberOfDigits % 2 == 0;

}
}