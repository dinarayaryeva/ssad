package com.company.searchEngine.Searcher;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;

public class VoiceSearcher extends Searcher {
    @Override
    public void handle(SearchRequest request, SearchResponse response) {
        super.handle(request, response);
        //specific voice search algorithm
        next.handle(request, response);
    }
}
