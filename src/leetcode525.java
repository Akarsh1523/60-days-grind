import java.util.*;
public class leetcode525 {

    public int findMaxLength(int[] nums) {
        ///Will treat 0 as -1 and 1 as 1 . Therefore now question gets converted to find maximum 0 sum subarray

        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);

        int currSum=0;
        int ans=0;

        for(int i=0;i<nums.length;i++){
            int currNum = nums[i];

            if(currNum==0) currSum-=1;
            else currSum+=1;

            if(mp.containsKey(currSum)){
                ans = Math.max(ans,(i - mp.get(currSum)));
            }
            else mp.put(currSum,i);
        }

        return ans;

    }
}
