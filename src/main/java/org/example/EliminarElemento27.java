package org.example;

import java.util.ArrayList;
import java.util.List;

public class EliminarElemento27 {

    public int removeElement(int [] nums, int val){
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

    public int versionMejorado(int [] nums, int val){
        int indice =0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == val){
                nums[indice] = nums[i];
                indice++;
            }

        }

        return indice;
    }

}
