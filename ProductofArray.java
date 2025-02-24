//T.C = O(n)
//S.C =O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] result  =  new int[nums.length];
        int rp = 1;
        result[0]=nums[0];
        
        for(int i = 1; i<nums.length ; i++)
        {
            rp = rp * nums[i-1];
            result[i]=rp;
            
        }
        
        rp =1;
        
        for(int i = nums.length-2; i>=0 ; i--)
        {
            rp = rp * nums[i+1];
            result[i]=rp * result[i];
            
        }
        
        return result;
        
    }
}