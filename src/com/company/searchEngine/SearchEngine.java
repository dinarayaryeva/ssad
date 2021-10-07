package com.company.searchEngine;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.searchEngine.Analytics.SearchAnalytics;
import com.company.searchEngine.Searcher.Searcher;
import com.company.searchEngine.Validator.Validator;

public abstract class SearchEngine <A extends SearchAnalytics,
        S extends Searcher, V extends Validator> {
    public S searcher;
    public V validator;
    public A analytics;
    public SearchResponse processSearchRequest(SearchRequest request) {
        SearchRequest validatedRequest = validator.validate(request);
        SearchResponse response = searcher.search(request);
        analytics.gatherSearchAnalytics(request, validatedRequest, response);
        return response;
    }
}
