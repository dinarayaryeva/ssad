package com.company.searchEngine.Analytics;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.searchEngine.Lexicon.LexiconManager;
import com.company.serverManager.ServerManager;

public abstract class Analytics {
    LexiconManager lexiconManager;
    ServerManager ServerSConnection;
    public abstract void gatherAnalytics(SearchRequest request, SearchRequest validatedRequest, SearchResponse response);
//    public void increaseClicksCount(SearchRequest request);
}
