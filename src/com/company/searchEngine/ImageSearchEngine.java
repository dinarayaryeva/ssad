package com.company.searchEngine;

import com.company.httpMessages.SearchRequest.ImageSearchRequest;
import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchRequest.StringSearchRequest;
import com.company.httpMessages.SearchResponse.ImageSearchResponse;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.searchEngine.Analytics.ImageSearchAnalytics;
import com.company.searchEngine.Searcher.ImageSearcher;
import com.company.searchEngine.Validator.ImageSearchValidator;

public class ImageSearchEngine extends SearchEngine {

    public ImageSearchEngine() {
        analytics = new ImageSearchAnalytics();
        searcher = new ImageSearcher();
        validator = new ImageSearchValidator();
    }

    public ImageSearchEngine(ImageSearchRequest request) {
        this();
        super.processSearchRequest(request);
    }
}
