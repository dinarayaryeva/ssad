package com.company.searchEngine.Analytics;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;

public class VoiceSearchAnalytics extends SearchAnalytics {

    @Override
    public boolean handle(SearchRequest request, SearchResponse response) {
        serverManager.gatherSearchAnalytics(request, response);
        return false;
    }
}
