package com.company.Controllers;

import com.company.httpMessages.SearchRequest.ImageSearchRequest;
import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchRequest.StringSearchRequest;
import com.company.httpMessages.SearchRequest.VoiceSearchRequest;
import com.company.httpMessages.SearchResponse.ImageSearchResponse;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.httpMessages.SearchResponse.StringSearchResponse;
import com.company.httpMessages.SearchResponse.VoiceSearchResponse;
import com.company.searchEngine.Analytics.ImageSearchAnalytics;
import com.company.searchEngine.Analytics.SearchAnalytics;
import com.company.searchEngine.Analytics.StringSearchAnalytics;
import com.company.searchEngine.Analytics.VoiceSearchAnalytics;
import com.company.searchEngine.Handler;
import com.company.searchEngine.Searcher.ImageSearcher;
import com.company.searchEngine.Searcher.Searcher;
import com.company.searchEngine.Searcher.StringSearcher;
import com.company.searchEngine.Searcher.VoiceSearcher;
import com.company.searchEngine.Validator.ImageSearchValidator;
import com.company.searchEngine.Validator.StringSearchValidator;
import com.company.searchEngine.Validator.Validator;
import com.company.searchEngine.Validator.VoiceSearchValidator;

public class SearchEngineDispatcher extends Handler {
    /**
     * provides implementation of Validator,
     * Searcher and Analytics depend on search request type
     */

    public void handle(SearchRequest request, SearchResponse response) {

        //Create objects to handle the request
        Validator validator = null;
        Searcher searcher = null;
        SearchAnalytics analytics = null;

        //Initialize handlers in chain depending on the request type
        if (request instanceof ImageSearchRequest) {
            validator = new ImageSearchValidator();
            searcher = new ImageSearcher();
            analytics = new ImageSearchAnalytics();


        } else if (request instanceof StringSearchRequest) {
            validator = new StringSearchValidator();
            searcher = new StringSearcher();
            analytics = new StringSearchAnalytics();
        } else if (request instanceof VoiceSearchRequest) {
            validator = new VoiceSearchValidator();
            searcher = new VoiceSearcher();
            analytics = new VoiceSearchAnalytics();
        }

        //Set the order for chain
        validator.setNext(searcher);
        searcher.setNext(searcher);
        searcher.setNext(analytics);

        //start processing
        validator.handle(request, response);

    }
}