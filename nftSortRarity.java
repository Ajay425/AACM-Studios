package com.company;


import java.util.Comparator;

public class nftSortRarity implements Comparator<nft>{


    // Sorts by NFT Rarity (Common, Epic, Legendary)
    @Override
    public int compare(nft o1, nft o2) {
        return o1.getRarity().compareTo(o2.getRarity());
    }
}