package collegeproblems.divideNconquer;

import java.util.Scanner;

public class MergeArray {
    private static void merge(int[] nums1, int[] nums2, int n1, int n2, int[] sortedArray) {
        var i = 0; var j = 0;
        var k = 0;
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j])
                sortedArray[k++] = nums1[i++];
            else
                sortedArray[k++] = nums2[j++];
        }
        while (i < n1)
            sortedArray[k++] = nums1[i++];
        while (j < n2)
            sortedArray[k++] = nums2[j++];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();
        int[] arr3 = new int[n + n2];


        merge(arr1, arr2, n, n2, arr3);
        for (int i : arr3) {
            System.out.print(i + " ");
        }
    }
}
