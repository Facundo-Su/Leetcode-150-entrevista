package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int resultado;

        int nums [] = {0,0,1,1,1,2,2,3,3,4};

        EliminarDuplicado26 prueba = new EliminarDuplicado26();
        resultado = prueba.remonveDuplicates(nums);
        System.out.println("el resultado es "+resultado);

    }

}