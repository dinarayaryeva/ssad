package com.company.searchEngine.Analytics;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;

public class StringSearchAnalytics extends SearchAnalytics {

    public StringSearchAnalytics() {
        super();
    }

    @Override
    public void handle(SearchRequest request, SearchResponse response) {
        super.handle(request, response);
        System.out.printf("Gatherting web-search analytics...\n");
        serverManager.gatherSearchAnalytics(request, response);
    }
}
