package org.example;

public class BestTimeToBuyAndSell_122 {
    public int maxProfit(int[] prices) {

        int precioMenor=prices[0];
        int profit=0;

        for (int i=1;i<prices.length;i++){

            if(precioMenor>prices[i]){
                precioMenor = prices[i];
            }else{
                profit += (prices[i] - precioMenor);
                precioMenor=prices[i];
            }

        }
        return profit;
    }

}
