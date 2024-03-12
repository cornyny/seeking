import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] numsStr = s.split(" ");
        int[] nums = new int[numsStr.length];
        for (int i = 0; i < numsStr.length; i++) {
            nums[i] = Integer.parseInt(numsStr[i]);
        }
         Arrays.sort(nums);
        
        answer = nums[0] + " " + nums[nums.length - 1];

        return answer;
    }
}