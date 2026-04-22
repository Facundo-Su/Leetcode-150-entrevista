package org.example;

public class EliminarDuplicado26 {

    public int remonveDuplicates(int [] nums){

        int contador=1;
        int repetido;

        repetido= nums[0];

        for (int i=1;i<nums.length;i++){
            if(nums[i]!=repetido){
                repetido= nums[i];
                nums[contador]=nums[i];
                contador++;
            }
        }

        return contador;

    }
}
