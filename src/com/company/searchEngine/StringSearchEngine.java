package com.company.searchEngine;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.ImageSearchResponse;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.httpMessages.SearchResponse.StringSearchResponse;
import com.company.searchEngine.Analytics.ImageSearchAnalytics;
import com.company.searchEngine.Analytics.StringSearchAnalytics;
import com.company.searchEngine.Searcher.ImageSearcher;
import com.company.searchEngine.Searcher.StringSearcher;
import com.company.searchEngine.Validator.ImageSearchValidator;

public class StringSearchEngine extends SearchEngine {

    public StringSearchEngine() {
        analytics = new StringSearchAnalytics();
        searcher = new StringSearcher();
        validator = new ImageSearchValidator();
    }

    @Override
    public SearchResponse processSearchRequest(SearchRequest request) {
        return new StringSearchResponse();
    }
}
