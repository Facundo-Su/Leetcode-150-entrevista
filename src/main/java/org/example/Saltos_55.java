package org.example;

public class Saltos_55 {
    public boolean canJump(int[] nums) {
        int contador =0;
        while(contador<nums.length){
            contador += nums[contador];
            System.out.println("el valor de contador es " + contador);

            if(contador == nums.length-1){
                return true;
            }

            if(nums[contador] ==0){
                return false;
            }

            if(contador>nums.length-1){
                return false;
            }


        }
        return true;
    }
    public boolean canJump2(int[] nums) {
        int maxReach = 0; // Almacena el índice más lejano que se puede alcanzar

        for (int i = 0; i < nums.length; i++) {
            // Si no podemos alcanzar esta posición, retornamos false
            if (i > maxReach) {
                return false;
            }

            // Actualizamos el índice más lejano que podemos alcanzar desde aquí
            maxReach = Math.max(maxReach, i + nums[i]);

            // Si el índice más lejano que podemos alcanzar es el último o más allá, retornamos true
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }

        // Si hemos recorrido todo el array y no hemos alcanzado el final, retornamos false
        return false;
    }

}



