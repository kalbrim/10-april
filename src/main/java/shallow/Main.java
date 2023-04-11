package shallow;

public class Main {
    public static void main(String[] args) {
        System.out.println("dont wait");
    }

//    public int pivotIndex(int[] nums) {
//        // dont run op ery time
//        int n = nums.length;
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += nums[i];
//        }
//        int leftSum = 0;
//        for (int i = 0; i < n; i++) {
//            // ret when left sum  =sum-left -curr
//            if (leftSum == sum - leftSum - nums[i]) {
//                return i;
//            }
//            leftSum += nums[i];
//        }
//        return -1;
//    }
}
