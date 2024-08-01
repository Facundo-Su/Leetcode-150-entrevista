package org.example;

public class RotateArray_189 {


    public void rotate(int [] nums, int k){

        for(int i=0;i<k;i++){
            agregar_inicio(nums);
        }

        for(int num : nums){
            System.out.println(num);
        }

    }

    public void agregar_inicio(int nums []){
        int ultimos_elementos = nums.length;

        int num = nums[ultimos_elementos-1];
        for(int i=ultimos_elementos-1;i>0;i--){
            nums[i] = nums[i-1];

        }
        nums[0]= num;
    }

}
