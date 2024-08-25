import java.util.Arrays;

public class RunningSumOf1dAArray1480 {
    public static void main(String[] args) {
        int [] nums = {1,1,1,1};
        int [] result = runningSum(nums);
    }
    public static int[] runningSum(int[] nums) {
        int [] runningSum = new int[nums.length];
        int sum = 0;
        for (int i = 0; i <= nums.length - 1; i++){
            sum = sum + nums[i];
            runningSum[i] = sum;


        }
        // if u need to print
        //    System.out.println(Arrays.toString(runningSum));

        return runningSum;
    }
}
