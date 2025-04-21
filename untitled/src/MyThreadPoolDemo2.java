public class MyThreadPoolDemo2 {
    public static void main(String[] args) {
        System.out.println(method("pwwkew"));//pkewkl
    }

    public static int method(String S) {
        //滑动窗口
        int[] ascii = new int[128];
        char[] charArray = S.toCharArray();
        int left = 0;
        int answer = 0;
        int length = S.length();
        for (int right = 0; right < length; right++) {
            ascii[charArray[right]]++;
            while (ascii[charArray[right]] > 1) {
                ascii[charArray[left]]--;
                left++;
            }
            answer = Math.max(answer, right - left + 1);
        }
        return answer;

    }
}
