package org.example;

public class FuncionarMatriz88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int contador = nums2.length;
        int j = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0) {
                if (contador > 0) {
                    nums1[i] = nums2[j];
                    j++;
                    contador--;
                }
            }
        }

        for (int i = 0; i < nums1.length; i++) {
            for (int k = 0; k < nums1.length - 1; k++) {
                if (nums1[k] > nums1[k + 1]) {
                    int temp = nums1[k];
                    nums1[k] = nums1[k + 1];
                    nums1[k + 1] = temp;
                }
            }
        }
    }

}
