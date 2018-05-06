package org.practice.algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BinarySearch {


    private static int searchKey(ArrayList<Integer> A, int l, int r, int key) {
        int middle = (l + r) / 2;
        if (l <= r) {
            if (key == A.get(middle)) {
                return middle;
            } else if (key < A.get(middle)) {
                return searchKey(A, l, middle - 1, key);
            } else
                return searchKey(A, middle + 1, r, key);
        } else
            return -1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int key = Integer.parseInt(br.readLine());
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>(n);
        String[] data = br.readLine().split(" ");
        for (String s : data) {
            list.add(Integer.parseInt(s));
        }
        int result = searchKey(list, list.get(0), list.get(n - 1), key);
        if (result == -1) {
            System.out.println("Key not found");
        } else
            System.out.println("Key is found At " + (result + 1));
    }
}
