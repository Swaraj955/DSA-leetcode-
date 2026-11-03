class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] returnValue = new int[nums.length];
        int product = 1;
        for (int i = 0; i<nums.length; i++){
            product *= nums[i];
            returnValue[i] = product;
        }
        product = 1;
        for(int i = nums.length - 1; i >=0; i--){
            returnValue[i] = product * ( i==0 ? 1 : returnValue[i-1]);
            product *= nums[i];
        }
        return returnValue;
    }
}