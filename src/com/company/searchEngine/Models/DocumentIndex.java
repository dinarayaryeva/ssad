package com.company.searchEngine.Models;

import com.company.serverManager.ServerManager;
import com.company.utils.htmlParser.Document;

public class DocumentIndex extends ForwardIndex {
    private int plainDocId;
    public DocumentIndex(Document doc) {}

    public String getPlainDoc() {
        return dataServerConnection.getPlainDocument(plainDocId);
    }
}
