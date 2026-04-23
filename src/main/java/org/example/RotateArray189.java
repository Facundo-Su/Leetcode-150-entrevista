package org.example;

public class RotateArray189 {
    public void rotate(int[] nums, int k) {

        k= k% nums.length;

        invertir(nums,0, nums.length-1);
        invertir(nums,0,k-1);
        invertir(nums,k, nums.length-1);
    }

    public void invertir(int[] nums, int inicio, int fin){

        while(inicio<fin){
            int aux = nums[fin];
            nums[fin]= nums[inicio];
            nums[inicio]=aux;
            inicio++;
            fin--;
        }


    }
}
