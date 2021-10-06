package com.company.searchEngine;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.searchEngine.Analytics.Analytics;
import com.company.searchEngine.Searcher.Searcher;
import com.company.searchEngine.Validator.Validator;

public abstract class SearchEngine {
    public Class<? extends Searcher> searcher;
    public Class<? extends Validator> validator;
    public Class<? extends Analytics> analytics;
    public abstract SearchResponse processSearchRequest(SearchRequest request);
}
