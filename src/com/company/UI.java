package com.company;
import java.util.Scanner;

public class UI {
    public static Coin askUserForCoin(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter Coin type: ");
        String input = keyboard.nextLine();
        switch (input.toUpperCase().substring(0, 2)){
            case "PE": return Coin.PENNY;
            case "NI": return Coin.NICKEL;
            case "DI": return Coin.DIME;
            case "QU": return Coin.QUARTER;
            default: return Coin.PENNY;
        }
    }
}
