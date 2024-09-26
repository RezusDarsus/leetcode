class Solution {
public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        int start = 0;
        int end = nums.length - 1;


        while (start <= end) {
            int medium = (start + end) / 2;
            int guess = nums[medium];
            if (guess == target) {
                result[0] = medium;
                end = medium - 1;
            } else if (guess  > target) {
                end = medium - 1;
           }else{
               start = medium + 1;
           }


        }
        start = 0;
        end = nums.length - 1;

        while (start <= end) {
            int medium = (start + end) / 2;
            int guess = nums[medium];
            if (guess == target) {
                result[1] = medium;
                start = medium + 1;
            }
            else if  (guess  > target){
                end = medium - 1;
            }else{
                start = medium + 1;
            }

        }
        return result;


    }
}
