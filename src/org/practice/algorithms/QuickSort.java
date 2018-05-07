package org.practice.algorithms;

public class QuickSort {
    public static void quickSort(int array[], int low, int high) {
        if (high > low) { // terminating condition
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }

    // function to swap two elements
    public static void swap(int a[], int low, int high) {
        int temp = a[low];
        a[low] = a[high];
        a[high] = temp;
    }

    // function to return the pivot value which is at its correct sorted place
    public static int partition(int a[], int low, int high) {
        int pivot_item = a[low];
        int left = low;
        int right = high;
        while (left < right) {
            while (a[left] <= pivot_item)
                left++;
            while (a[right] > pivot_item)
                right--;
            if (left < right)
                swap(a, left, right);
        }
        a[low] = a[right];
        a[right] = pivot_item;
        return right;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int array[] = {2, 3, 2, 1, 1, 1, 1, 5, 5, 4, 4, 5, 2, 2, 2, 4, 6, 1, 8, 9, 10};
        int size = array.length;
        quickSort(array, 0, size - 1);
        printArray(array);
    }
}

