package com.company;


import java.util.Comparator;

public class nftSortName implements Comparator<nft>{


    // Sorts by NFT Name alphabetically
    @Override
    public int compare(nft o1, nft o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
