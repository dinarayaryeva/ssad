package com.company.searchEngine;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.httpMessages.SearchResponse.VoiceSearchResponse;

public class VoiceSearchEngine extends SearchEngine {
    @Override
    public SearchResponse processSearchRequest(SearchRequest request) {
        return new VoiceSearchResponse();
    }
}
