class Solution2 {
    public static int trap(int[] height) {
        int n = height.length;
        int[] prevMax = new int[n];
        prevMax[0] = height[0];
        int[] sufMax = new int[n];
        sufMax[n - 1] = height[n - 1];

        for (int i = 1; i < n; i++) {
            prevMax[i] = Math.max(height[i], prevMax[i - 1]);
            sufMax[n - 1 - i] = Math.max(height[n - 1 - i], sufMax[n - i]);
        }
        int water = 0;
        for (int i = 1; i < n; i++) {
            water += Math.min(prevMax[i], sufMax[i]) - height[i];
        }
        return water;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}

class Solution3 {
    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        int f = 0;
        for(int x: nums){
            f = Math.max(f,0)+x;
            result = Math.max(f,result);
        }

        return result;
    }
}