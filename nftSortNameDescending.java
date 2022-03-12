package com.company;


import java.util.Comparator;

public class nftSortNameDescending implements Comparator<nft>{


    // Sorts by NFT Name alphabetically in descending order
    @Override
    public int compare(nft o1, nft o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
