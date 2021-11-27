package com.company.searchEngine;

import com.company.searchEngine.Indexer.Indexer;
import com.company.searchEngine.Models.Index.DocumentIndex;
import com.company.serverManager.ServerManager;
import com.company.utils.PlainDocument;

public class PageFetcher {
    /**
     * Fetches specific requested
     * page from the web on client demand
     */
    ServerManager dataServerConnection;
    Crawler crawler;
    Extractor extractor;
    Indexer indexer;
    public DocumentIndex fetchFromLiveURL(String url) {

        PlainDocument doc = crawler.downloadDoc(url);
        DocumentIndex index = indexer.makeDocumentIndex(doc, url);

        extractor.loadUrlToServer(url);
        dataServerConnection.storeIndex(index);

        return index;
    }
}
