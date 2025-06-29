package ru.netology.service;

public class CustomsService {
    static final int PRICE_RUB_TAX_RATE =100;
    static final int WEIGHT_KG_TAX_RATE =100;

    //calc incoming tax
    public static int calcTax (int priceRub, int weightKg){
        return priceRub/PRICE_RUB_TAX_RATE + weightKg*WEIGHT_KG_TAX_RATE;
    }

}



