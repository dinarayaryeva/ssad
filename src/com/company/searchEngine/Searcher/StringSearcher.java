package com.company.searchEngine.Searcher;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.ImageSearchResponse;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.httpMessages.SearchResponse.StringSearchResponse;
import com.company.searchEngine.Lexicon.LexiconManager;
import com.company.serverManager.ServerManager;

public class StringSearcher extends Searcher {
    ServerManager serversConnection;
    LexiconManager lexiconManager;

    @Override
    public SearchResponse search(SearchRequest searchRequest) {
        return new StringSearchResponse();
    }
}
