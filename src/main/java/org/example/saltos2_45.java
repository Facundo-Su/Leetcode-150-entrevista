package org.example;

public class saltos2_45 {
    public int canJump2(int[] nums) {

        int n = nums.length;
        int actual_posicion =0;
        int maximo_posicion=0;
        int salto=0;

        if(n<1){
            return 1;
        }

        for(int i=0;i<n;i++){
            maximo_posicion = Math.max(maximo_posicion,i+nums[i]);

            if(actual_posicion == i){
                salto++;

                actual_posicion = maximo_posicion;

                if(actual_posicion>=n-1){
                    break;
                }

            }

        }


        return salto;
    }
}
