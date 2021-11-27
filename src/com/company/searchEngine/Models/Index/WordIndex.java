package com.company.searchEngine.Models.Index;

import java.util.ArrayList;

public class WordIndex extends InvertedIndex {
    private Integer wordId;
    //IDS of documents where word occurs
    private ArrayList<Integer> docIds;

    public WordIndex(Integer wordId, ArrayList<Integer> docIds)
    {
        this.wordId = wordId;
        this.docIds = docIds;
    }

    public Integer getWordId() {
        return wordId;
    }
    public ArrayList<Integer> getDocIds() {
        return docIds;
    };
}
