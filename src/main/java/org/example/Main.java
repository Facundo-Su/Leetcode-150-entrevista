package org.example;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer numero =10001001;
        int contador=0;

        String numero_texto= String.valueOf(numero);

        for(int i=0;i<numero_texto.length();i++){
            if(numero_texto.charAt(i) == '1'){
                System.out.println("aparecio "+contador+" digito");
                contador=0;
            }else{
                contador++;
            }

        }

    }

}