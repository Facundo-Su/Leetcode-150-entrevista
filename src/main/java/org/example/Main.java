package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int resultado;

        int nums [] = {1,1,1,2,2,3};

        EliminarDuplicadoV280 prueba = new EliminarDuplicadoV280();
        resultado = prueba.removeDuplicates(nums);
        System.out.println("el resultado es "+resultado);

    }

}