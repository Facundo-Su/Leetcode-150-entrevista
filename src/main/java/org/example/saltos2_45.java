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

    private int salto(int nums []){

        int paso_actual =0;
        int paso_maximo=0;
        int salto =0;

        for(int i =1;i<nums.length;i++){
            paso_maximo = Math.max(paso_maximo,nums[i]);
            if(paso_actual == i){
                salto ++;
                paso_actual = paso_maximo;
                if(paso_actual > nums.length){
                    break;
                }
            }

        }

        return 0;

    }


}
