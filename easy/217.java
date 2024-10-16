import java.util.Hashtable;
class Solution {
    public boolean containsDuplicate(int[] nums) {
      Hashtable <Integer, Boolean> table = new Hashtable<>();
     for (int i = 0 ; i < nums.length ; i++){
          int num = nums[i];

          if(table.containsKey(num)){
              return true;
          }
          
          table.put(num,true);
      }
      return false;
    }
}
