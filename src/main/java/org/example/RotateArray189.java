package org.example;

public class RotateArray189 {
    public void rotate(int[] nums, int k) {

        int puntero;
        int cantidad= nums.length;
        int aux;
        for(int i=0;i<k;i++){
            nums[0] = nums[cantidad-1];

            for (int j=cantidad-2;j>1;j--){
                aux=nums[j+1];
                nums[j+1]=nums[j];
            }

        }


    }
}
