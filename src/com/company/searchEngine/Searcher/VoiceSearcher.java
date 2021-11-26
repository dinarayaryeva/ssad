package com.company.searchEngine.Searcher;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.httpMessages.SearchResponse.StringSearchResponse;

public class VoiceSearcher extends Searcher {
    @Override
    public SearchResponse handle(SearchRequest searchRequest) {
        return new StringSearchResponse();
    }
}
