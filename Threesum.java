import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int target = - nums[i];
            int low = i + 1;
            int high = nums.length - 1;

            while(low < high) {
                int sum = nums[low] + nums[high];

                if(sum > target) high--;
                else if(sum < target) low++;

                else {
                    ArrayList<Integer> list1 = new ArrayList<>();
                    list1.add(nums[i]);
                    list1.add(nums[low]);
                    list1.add(nums[high]);
                    list.add(list1);

                    while(low < high && nums[low] == nums[low + 1]) low++;
                    while(low < high && nums[high] == nums[high - 1]) high--;

                    low++;
                    high--;
                }
            }
        }
        return list;
    }
}
