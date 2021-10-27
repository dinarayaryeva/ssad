package com.company.searchEngine;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchRequest.StringSearchRequest;
import com.company.httpMessages.SearchRequest.VoiceSearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.httpMessages.SearchResponse.VoiceSearchResponse;
import com.company.searchEngine.Analytics.StringSearchAnalytics;
import com.company.searchEngine.Analytics.VoiceSearchAnalytics;
import com.company.searchEngine.Searcher.StringSearcher;
import com.company.searchEngine.Validator.ImageSearchValidator;

public class VoiceSearchEngine extends SearchEngine {

    public VoiceSearchEngine() {
        analytics = new VoiceSearchAnalytics();
        searcher = new StringSearcher();
        validator = new ImageSearchValidator();
    }

    public VoiceSearchEngine(VoiceSearchRequest request) {
        this();
        super.processSearchRequest(request);
    }
}
