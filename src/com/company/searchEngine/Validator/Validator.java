package com.company.searchEngine.Validator;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.searchEngine.Handler;
import com.company.serverManager.ServerManager;

public abstract class Validator extends Handler {
    /**
     *  Checks whether search request asset
     *  (search string / voice record / image) has correct format
     */

    ServerManager dataServerConnection;

    protected abstract boolean isValid(SearchRequest request);

    public void handle(SearchRequest request, SearchResponse response) {

        super.handle(request, response);

        if (!isValid(request)) {
            response.error = "Incorrect search request!";
            return;
        }

        next.handle(request, response);
    }


}
