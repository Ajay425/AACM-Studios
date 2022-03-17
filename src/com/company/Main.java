package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    // Sample test object for change price
        nft test = new nft();
        test.setName("Gangster Monkey");
        test.setCategory("Monkey");
        test.setImageName("GangsterMonkey.jpg");
        test.setRarity("Epic");
        test.setPriceOfNFT(750);
        int balance = 1000;
        int dayCounter = 1;
        while(balance != 5000){
            System.out.println(String.format("Day (%d): Enter to continue", dayCounter));
            dayCounter++;
            Scanner in = new Scanner(System.in);
            in.nextLine();
            int currentPrice = test.getPriceOfNFT();
            String rarity = test.getRarity();
            test.changePrice(currentPrice, rarity);
            int newPrice = test.getPriceOfNFT();
            balance += newPrice;
            System.out.println(String.format("Gangster Money Price: (%d)\n", newPrice));
        }
    }
}
