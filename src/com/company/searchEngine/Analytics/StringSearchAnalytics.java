package com.company.searchEngine.Analytics;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;

public class StringSearchAnalytics extends SearchAnalytics {

    @Override
    public boolean handle(SearchRequest request, SearchResponse response) {
        super.handle(request, response);
        System.out.printf("Gatherting web-search analytics...\n");
        serverManager.gatherSearchAnalytics(request, response);
        return false;
    }
}
