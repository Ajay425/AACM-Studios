package com.company;


import java.util.Comparator;

public class nftSortCategoryDescending implements Comparator<nft>{


    // Sorts by Category name alphabetically in descending order
    @Override
    public int compare(nft o1, nft o2) {
        return o2.getCategory().compareTo(o1.getCategory());
    }
}