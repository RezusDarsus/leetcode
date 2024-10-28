class Solution {
    public int search(int[] nums, int target) {
          int start = 0;
       int end =  nums.length - 1;
       while (end >= start){
           int mid = (end - start) / 2 + start;
           if(target == nums[mid]){
               return mid;
           }
           if(target > nums[mid]){
            start = mid  + 1;
           }else{
               end = mid - 1;
           }

       }
       return -1;
    }
}
