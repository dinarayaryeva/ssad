package com.company.searchEngine.Analytics;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.searchEngine.Handler;
import com.company.searchEngine.Lexicon.Lexicon;
import com.company.serverManager.ServerManager;

public abstract class SearchAnalytics extends Handler {

    /**
     * Gathers analytics about performed search
     * (in the simplified implementation just calls mock method)
     */

    ServerManager serverManager;
    Lexicon lexicon;

    SearchAnalytics() {
        serverManager = new ServerManager();
    }

    public void handle(SearchRequest request, SearchResponse response) {
        super.handle(request, response);
    }

}
