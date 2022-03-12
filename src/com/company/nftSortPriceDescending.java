package com.company;


import java.util.Comparator;

public class nftSortPriceDescending implements Comparator<nft>{


    // Sorts by NFT Price high to low
    @Override
    public int compare(nft o1, nft o2) {
        return o2.getPriceOfNFT() - (o1.getPriceOfNFT());
    }
}