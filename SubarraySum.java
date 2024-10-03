public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, 3, 1, -4};
        int targetSum = 7;

        findSubarraysWithSum(arr, targetSum);
    }

    public static void findSubarraysWithSum(int[] arr, int targetSum) {
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];

                if (sum == targetSum) {

              for(int i=start; i<=end; i++) {
                  System.out.print(arr[i]+" ");
              }
              System.out.println();
                }
            }
        }
    }
}
