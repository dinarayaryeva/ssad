package com.company.searchEngine.Analytics;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.searchEngine.Handler;
import com.company.searchEngine.Lexicon.LexiconManager;
import com.company.serverManager.ServerManager;

public abstract class SearchAnalytics extends Handler {

    ServerManager serverManager;
    LexiconManager lexiconManager;

    public abstract boolean handle(SearchRequest request, SearchResponse response);

}
