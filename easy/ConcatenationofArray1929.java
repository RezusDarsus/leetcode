import java.util.Arrays;

public class ConcatentionOfArray1929 {
    public static void main(String[] args) {
    int[] nums = {1,2,1};
    int[] result = getConcatenation(nums);
    }
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for(int i = 0; i < nums.length;i++){
            ans[nums.length + i] = nums[i];
            ans[i] = nums[i];

        }
      // if u need print
      //   System.out.println(Arrays.toString(ans));


        return ans;
    }
}
