import java.util.Arrays;

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int acount = 0;
        int bcount = 0;

        for(int i = 0;i < nums.length;i++){
            if(nums[i] % 2 == 0) {
                acount++;
            }else {
                bcount++;
            }
        }
        int[] aarr = new int[acount];
        int[] barr = new int[bcount];
        acount = 0;
        bcount = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] % 2 == 0) {
                aarr[acount] = nums[i];
                acount++;
            }else {
                barr[bcount] = nums[i];
                bcount++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < aarr.length) {
                nums[i] = aarr[i];
            }else {
                for (int j = 0; j < barr.length; j++) {
                    nums[i+j] = barr[j];
                }
                break;
            }

        }
      
        return nums;
    }
}
