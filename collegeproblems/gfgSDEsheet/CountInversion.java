package collegeproblems.gfgSDEsheet;

public class CountInversion {
    public static int inversions(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }

            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 4, 1, 3, 5};
        int result = inversions(arr, n);
        System.out.println(result);
    }
}
