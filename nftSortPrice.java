package com.company;


import java.util.Comparator;

public class nftSortPrice implements Comparator<nft>{


    // Sorts by NFT Price low to high
    @Override
    public int compare(nft o1, nft o2) {
        return o1.getPriceOfNFT() - (o2.getPriceOfNFT());
    }
}