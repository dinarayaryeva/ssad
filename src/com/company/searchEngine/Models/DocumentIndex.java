package com.company.searchEngine.Models;

import com.company.serverManager.ServerManager;
import com.company.utils.htmlParser.Document;

public class DocumentIndex extends ForwardIndex {
    private int plainDocId;
    private int docId;
    private int docStatus;
    private String hash;
    private int visits;
    private int seoRank;

    public static DocumentIndex getIndexById(int docId) {
        return null;
    }

    public DocumentIndex(Document doc) {}

    public int getSeoRank() {
        return seoRank;
    }

    public void increaseVisitsCount() {visits++; }

    public void setSeoRank(int seoRank) {
        this.seoRank = seoRank;
    }

    public String getPlainDoc() {
        return dataServerConnection.getPlainDocument(plainDocId);
    }
}
