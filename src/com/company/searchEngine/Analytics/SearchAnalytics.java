package com.company.searchEngine.Analytics;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.searchEngine.Lexicon.LexiconManager;
import com.company.serverManager.ServerManager;

public abstract class SearchAnalytics extends Analytics {
    LexiconManager lexiconManager;
    public abstract void gatherSearchAnalytics(SearchRequest request, SearchRequest validatedRequest, SearchResponse response);



}
