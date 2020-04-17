package singlenum;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        
        for(int i=0;i<nums.length; i++) //it's faster than the foreachloop 
            res^=nums[i];
        return res;
        
    }

}
