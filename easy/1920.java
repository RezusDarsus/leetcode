import java.util.Arrays;

public class buildarray1920 {
    public static void main(String[] args) {
        int [] nums = {0,2,1,5,3,4};
        int [] result = buildArray(nums);
    }
    public  static int[] buildArray(int[] nums) {
     int [] ans = new int[nums.length];
     for (int i = 0; i < nums.length; i++){
         ans[i] = nums[nums[i]];
     }
     // print if u need
        // System.out.println(Arrays.toString(ans));
        
     return ans;

    }
}
