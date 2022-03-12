package com.company;


import java.util.Comparator;

public class nftSortCategory implements Comparator<nft>{


    // Sorts by Category name alphabetically
    @Override
    public int compare(nft o1, nft o2) {
        return o1.getCategory().compareTo(o2.getCategory());
    }
}