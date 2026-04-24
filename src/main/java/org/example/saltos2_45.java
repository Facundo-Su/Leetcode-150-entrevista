package org.example;

public class saltos2_45 {
    public int canJump2(int[] nums) {

        int max_alcance= nums[0];
        int max_actual = nums[0];
        int resultado =1;

        if(nums.length ==1){
            return 0;
        }

        for(int i=1;i< nums.length;i++){

            if(nums[i] + i >max_alcance){
                max_alcance = nums[i] + i;
            }

            if(i==max_actual){

                if(max_actual<nums.length-1){
                    resultado++;
                }

                max_actual= max_alcance;
                if(max_alcance>= nums.length-1){
                    return resultado;
                }


            }

        }

        return resultado;
    }



}
