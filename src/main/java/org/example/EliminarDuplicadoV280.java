package org.example;

public class EliminarDuplicadoV280 {

    public int removeDuplicates(int [] nums){

        int indexeado=1;
        int acumulador =1;


        for(int i=1;i<nums.length;i++){

            if(nums[i] == nums[i-1]){
                acumulador++;
            }else{
                acumulador = 1;
            }

            if(acumulador <=2){
                nums[indexeado] = nums[i];
                indexeado++;
            }

        }

        for(int aux : nums){
            System.out.println(aux);
        }

        return indexeado;
    }

}
