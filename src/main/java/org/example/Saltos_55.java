package org.example;

public class Saltos_55 {
    public boolean canJump(int[] nums) {
        int cantidad = nums.length;
        int maxlcance =nums[0];

        if(cantidad==1){
            return true;
        }

        for(int i=1;i<=maxlcance;i++){

            if(nums[i] + i>maxlcance){
                maxlcance=i+nums[i];
            }

            if(maxlcance >= cantidad-1){
                return true;
            }

        }

        return false;
    }

}



