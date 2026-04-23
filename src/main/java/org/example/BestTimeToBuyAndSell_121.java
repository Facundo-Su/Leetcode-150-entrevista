package org.example;

public class BestTimeToBuyAndSell_121 {

    public int maxProfit(int[] prices){

        int cantidad = prices.length;
        int profitMax =0;
        int precioMin=prices[0];

        for(int i=1;i<cantidad;i++){
            if(prices[i]<precioMin){
                precioMin=prices[i];
            }
            if(profitMax<prices[i]-precioMin){
                profitMax = prices[i] - precioMin;
            }

        }

        return profitMax;
    }

}
