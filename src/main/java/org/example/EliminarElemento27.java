package org.example;

import java.util.ArrayList;
import java.util.List;

public class EliminarElemento27 {

    public int removeElement(int [] nums, int val){

        int k=0;

        for (int i=0;i< nums.length;i++){
            if (nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }

        return k;


    }

}
