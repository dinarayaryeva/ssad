package com.company.searchEngine.Searcher;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.searchEngine.Handler;
import com.company.serverManager.ServerManager;

public abstract class Searcher extends Handler {
    /**
     * Fetches pages containing initial query keywords / image
     * (or something similar) from the database and sorts them by relevance
     */

    ServerManager dataServerConnection;

    public void handle(SearchRequest request, SearchResponse response) {
        super.handle(request, response);
    }

}
