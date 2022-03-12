package com.company;


import java.util.Comparator;

public class nftSortRarityDescending implements Comparator<nft>{


    // Sorts by NFT Rarity (Legendary, Epic, Common)
    @Override
    public int compare(nft o1, nft o2) {
        return o2.getRarity().compareTo(o1.getRarity());
    }
}