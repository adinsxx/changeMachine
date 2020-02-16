package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Coin> wallet = new ArrayList<>();
        for (int i = 0; i <5; i++){
            wallet.add(UI.askUserForCoin());
        }
        int sum = 0;
        for (Coin coin:wallet){
            sum += coin.getValue();
        }
        System.out.println(sum);
    }
}
