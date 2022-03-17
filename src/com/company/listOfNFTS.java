package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class ListOfNFTS {

    // Instance Variables
    private ArrayList nftList = new ArrayList();

    // Constructor
    public ListOfNFTS(){
    }

    public ListOfNFTS(ArrayList nftList){
        this.nftList = nftList;
    }

    public void sortNFT(ArrayList nftList, int choose){
        if (choose == 1){
            Collections.sort(nftList, new nftSortName());
        }
        else if (choose == 2){
            Collections.sort(nftList, new nftSortNameDescending());
        }
        else if (choose == 3){
            Collections.sort(nftList, new nftSortPrice());
        }
        else if (choose == 4){
            Collections.sort(nftList, new nftSortPriceDescending());
        }
        else if (choose == 5){
            Collections.sort(nftList, new nftSortRarity());
        }
        else if (choose == 6){
            Collections.sort(nftList, new nftSortRarityDescending());
        }
        else if (choose == 7){
            Collections.sort(nftList, new nftSortCategory());
        }
        else{
            Collections.sort(nftList, new nftSortCategoryDescending());
        }
    }

    public void setNFTList(ArrayList nftList){
        this.nftList = nftList;
    }

    public ArrayList getNFTList(){
        return nftList;
    }

    public void addNFT(nft nft){
        nftList.add(nft);
    }

}
