package com.company.searchEngine.Validator;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.searchEngine.Handler;
import com.company.serverManager.ServerManager;

public abstract class Validator extends Handler {
    /**
     * Checks for spelling mistakes and also if the
     * word used in query is unknown then gives suggestion
     * regarding related words. In simplified implementation
     * only first step is performed.
     */
    ServerManager dataServerConnection;

    protected abstract boolean isValid(SearchRequest request);

    public boolean handle(SearchRequest request, SearchResponse response) {
        super.handle(request, response);
        return false;
    }


}
