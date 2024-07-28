package org.example;

public class EliminarDuplicado26 {

    public int remonveDuplicates(int [] nums){

        int indexeado=0;
        Boolean coincide = false;

        for(int i=0;i<nums.length;i++){

            for(int j=0;j<i;j++){
                if(nums[i] == nums[j]){
                    coincide = true;
                    break;
                }
            }

            if(!coincide){
                nums[indexeado] = nums[i];
                indexeado++;
            }
            coincide = false;

        }

        for(int i=0;i< nums.length;i++){
            System.out.println(nums[i]);
        }


        return indexeado;
    }
}
