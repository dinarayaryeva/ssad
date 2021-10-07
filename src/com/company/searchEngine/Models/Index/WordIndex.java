package com.company.searchEngine.Models.Index;

import com.company.searchEngine.Models.Hit.HitsInfo;

public class WordIndex extends InvertedIndex{
    int wordId;
    private HitsInfo [] hitsInfos;

    public WordIndex(int wordId) {
        this.wordId = wordId;
    }

    public int getWordId() {
        return wordId;
    }

    public void setHitsInfo(HitsInfo [] hitsInfos){
        this.hitsInfos = hitsInfos;
    }

    public HitsInfo [] getHitsInfos(){
        return hitsInfos;
    }
}
