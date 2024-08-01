package org.example;

public class BestTimeToBuyAndSell_122 {
    public int maxProfit(int[] prices) {

        int max_ganancia =0;
        int minimo = Integer.MAX_VALUE;

        for(int precio : prices){

            if(precio<minimo){
                minimo = precio;
            }else{
                int ganancia = precio - minimo;
                max_ganancia+=ganancia;
                minimo = precio;

            }


        }

        return max_ganancia;


    }

}
