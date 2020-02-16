package com.company;

public enum Coin {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);

    private int value;
    Coin(int i){
        value = i;
    }

    public int getValue(){
        return this.value;
    }
}
