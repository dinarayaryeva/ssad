package com.company.searchEngine.Searcher;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.searchEngine.Lexicon.LexiconManager;
import com.company.serverManager.ServerManager;

public abstract class Searcher {
    LexiconManager lexiconManager;
    ServerManager dataServerConnection;
    public abstract SearchResponse search(SearchRequest searchRequest);
}
