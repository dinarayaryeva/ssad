package com.company.searchEngine.Analytics;

import com.company.httpMessages.SearchRequest.ImageSearchRequest;
import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.ImageSearchResponse;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.searchEngine.Searcher.Searcher;
import com.company.searchEngine.Validator.Validator;

public class ImageSearchAnalytics extends Analytics  {
    @Override
    public void gatherAnalytics(SearchRequest request, SearchRequest validatedRequest, SearchResponse response) {}
}
