package org.example;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        int nums [] = {2,3,0,1,4};

        Saltos_55 prueba = new Saltos_55();
        Boolean resultado = prueba.canJump(nums);
        System.out.println("el resultado es "+resultado);

    }

}