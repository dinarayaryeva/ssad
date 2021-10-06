package com.company.searchEngine;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.ImageSearchResponse;
import com.company.httpMessages.SearchResponse.SearchResponse;

public class ImageSearchEngine extends SearchEngine {

    @Override
    public SearchResponse processSearchRequest(SearchRequest request) {
        return new ImageSearchResponse();
    }
}
