package com.company.searchEngine.Models.Index;

public class WordIndex extends InvertedIndex{
    int wordId;

    public WordIndex(int wordId) {
        this.wordId = wordId;
    }

    public int getWordId() {
        return wordId;
    }

}
