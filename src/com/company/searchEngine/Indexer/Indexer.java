package com.company.searchEngine.Indexer;

import com.company.searchEngine.Models.Index.DocumentIndex;
import com.company.seoSuggester.SEORanker;
import com.company.serverManager.ServerManager;
import com.company.utils.PlainDocument;
import com.company.utils.htmlParser.Document;

public class Indexer {

    ServerManager dataServerConnection;
    SEORanker seoRanker;

    public DocumentIndex makeDocumentIndex(PlainDocument doc) {
        DocumentIndex index = new DocumentIndex(doc);
        int seoRank = seoRanker.calculateDocumentRank(index);
        index.setSeoRank(seoRank);
        dataServerConnection.storeIndex(index);
        return index;
    }
//    public DocumentIndex updateDocumentIndex(DocumentIndex doc) {
//
//    }
}
