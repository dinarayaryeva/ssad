package com.company.searchEngine.Analytics;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;

public class ImageSearchAnalytics extends SearchAnalytics {

    @Override
    public void handle(SearchRequest request, SearchResponse response) {
        serverManager.gatherSearchAnalytics(request, response);
    }
}
