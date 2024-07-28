package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int resultado;

        int nums [] = {0,1,2,2,3,0,4,2};
        int val = 2;

        resultado = removeElement(nums,val);
        System.out.println(resultado);

    }

    public static int removeElement(int[] nums, int val){
        int resultado;
        List<String> lista = new ArrayList<>();
        int contador =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                String aux = String.valueOf(nums[i]);
                lista.add(aux);

            }else{
                contador++;
            }

        }
        int j=0;
        for(String aux :lista){
            System.out.println(aux);
            nums[j] = Integer.parseInt(aux);
            j++;
        }

        resultado = lista.size();

        for(int i=0;i<contador;i++){
            lista.add("_");
        }





        return resultado;
    }




}