package org.example;

public class RemoveDuplicate80 {

    public int removeDuplicates(int[] nums) {

        int duplicado = nums[0];
        int contador =1;
        int posicion=1;

        for(int i=1;i< nums.length;i++){

            if(nums[i]!=duplicado){
                contador=0;
                duplicado=nums[i];
            }

            if (contador<2){
                nums[posicion]=nums[i];
                posicion++;
                contador++;
            }



        }
        return posicion;
    }
    
}
