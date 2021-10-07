package com.company.searchEngine.Indexer;

import com.company.searchEngine.Models.DocumentIndex;
import com.company.seoSuggester.SEORanker;
import com.company.serverManager.ServerManager;
import com.company.utils.htmlParser.Document;

public class Indexer {

    ServerManager dataServerConnection;
    SEORanker seoRanker;

    public DocumentIndex makeDocumentIndex(Document doc) {
        DocumentIndex index = new DocumentIndex(doc);
        seoRanker.calculateDocumentRank(index);
        dataServerConnection.storeIndex(index);
        return index;
    }
//    public DocumentIndex updateDocumentIndex(DocumentIndex doc) {
//
//    }
}
