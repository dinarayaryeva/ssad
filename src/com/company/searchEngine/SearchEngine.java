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
    public SearchRequest request;
    public SearchResponse response;

    public SearchEngine() {}

    public SearchEngine(SearchRequest request) {
        processSearchRequest(request);
    }

    /**
     * Holds basic logic for processing search requests - validation,
     * searching and gathering analytics. Real search engine
     * implementations have much more steps.
     * @param request
     * @return
     */
    public SearchResponse processSearchRequest(SearchRequest request) {

        this.request = request;

        this.request = validator.validate(this.request);
        response = searcher.search(this.request);
        analytics.gatherSearchAnalytics(request, this.request, response);

        /*
        Freeing search engine worker after processing the request, so it can
        be used to handle another.
         */
        this.request = null;

        return response;
    }

}
