package com.company.searchEngine.Models.Index;

import com.company.utils.PlainDocument;
import com.company.utils.htmlParser.Document;

public class DocumentIndex extends ForwardIndex {

    //List of words in the document (HitList) is omitted

    private int plainDocId;
    private int docId;
    private int docStatus;
    private String hash;
    private int visits;
    private int seoRank;
    private String url;

    /**
     * Separation between HTML document and index
     * document model needed
     */
    private Document docData;

    public DocumentIndex(Document docData) {
        this.docData = docData;
    }

    public DocumentIndex(Document docData, String url) {
        this.docData = docData;
        this.url = url;
        this.docId = url.hashCode();
    }

    public static DocumentIndex getIndexById(int docId) {
        return null;
    }

    public Integer getDocId() {
        return docId;
    }

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

    public Document getDocData() {
        return docData;
    }

    public String getUrl() { return url; }

    @Override
    public String toString() {
        return url;
    }
}
