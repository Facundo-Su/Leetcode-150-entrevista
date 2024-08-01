package org.example;

public class MaximaVecesAparecido_169 {

    public int majorityElement(int [] nums){

        int [] aux;
        int contador =0;
        int candidatos =0;
        for(int i=0;i<nums.length;i++){

            if(contador ==0){
                candidatos = nums[i];
            }

            if(nums[i] == candidatos){
                contador++;
            }else{
                contador --;
            }

        }



        return candidatos;
    }



}
