import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        // 定义集合
        int[] nums = {1, 2, 3, 4};

        // 子集总数为 2^n
        int n = nums.length;
        int totalSubsets = 1 << n; // 等价于 2^n

        // 遍历所有可能的状态
        for (int i = 0; i < totalSubsets; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                // 检查第 j 位是否为 1
                if (((i >> j) & 1) == 1) {
                    subset.add(nums[j]);
                }
            }
            // 打印当前子集
            System.out.println(subset);
        }
    }
}