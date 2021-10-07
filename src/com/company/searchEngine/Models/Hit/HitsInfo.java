package com.company.searchEngine.Models.Hit;

public class HitsInfo {
    private int docId;
    private Hit [] hitList;

    public HitsInfo(int docId, Hit [] hitList){
        this.docId = docId;
        this.hitList = hitList;
    }
}
