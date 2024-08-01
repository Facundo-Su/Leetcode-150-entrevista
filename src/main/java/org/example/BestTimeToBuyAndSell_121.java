package org.example;

public class BestTimeToBuyAndSell_121 {

    public int maxProfit(int[] prices){

        int max_ganancia=0;
        int valor_minimo = Integer.MAX_VALUE;

        for(int num : prices){

            if(num<valor_minimo){
                valor_minimo= num;
            }else{
                int ganancia = num - valor_minimo;

                if(ganancia >max_ganancia){

                    max_ganancia = ganancia;
                }

            }


        }


        return max_ganancia;
    }

}
