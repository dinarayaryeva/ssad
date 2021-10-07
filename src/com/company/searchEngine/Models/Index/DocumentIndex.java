package com.company.searchEngine.Models.Index;

import com.company.searchEngine.Models.Hit.Hit;
import com.company.utils.PlainDocument;
import com.company.utils.htmlParser.Document;

public class DocumentIndex extends ForwardIndex {
    private int plainDocId;
    private int docId;
    private int docStatus;
    private String hash;
    private int visits;
    private int seoRank;

    public Hit[] getHitList(int wordId){
        return new Hit[100];
    }

    public int getDocId() {
        return docId;
    }
    public static DocumentIndex getIndexById(int docId) {
        return null;
    }

    public DocumentIndex(PlainDocument doc) {}

    public int getSeoRank() {
        return seoRank;
    }

    public void increaseVisitsCount() { visits++; }

    public void setSeoRank(int seoRank) {
        this.seoRank = seoRank;
    }

    public String getPlainDoc() {
        return dataServerConnection.getPlainDocument(plainDocId);
    }
}
