package com.company.searchEngine;

import com.company.searchEngine.Indexer.Indexer;
import com.company.searchEngine.Models.Index.DocumentIndex;
import com.company.serverManager.ServerManager;
import com.company.utils.PlainDocument;

public class PageFetcher {
    ServerManager dataServerConnection;
    Crawler crawler;
    Indexer indexer;
    public DocumentIndex fetchFromLiveURL(String url) {

        PlainDocument doc = crawler.downloadDoc(url);
        DocumentIndex index = indexer.makeDocumentIndex(doc);
        dataServerConnection.storeIndex(index);
        return index;
    }
}
