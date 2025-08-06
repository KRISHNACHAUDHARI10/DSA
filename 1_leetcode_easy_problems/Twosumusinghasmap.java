
import java.util.HashMap;
import java.util.Map;

class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }

    for (int i = 0; i < nums.length; i++) {
      int num = target - nums[i];
      int result = map.getOrDefault(num, -1);
      if (result >= 0 && result != i) {
        return new int[] { i, result };
      }
    }

    throw new IllegalArgumentException("invalid input");
  }
}
