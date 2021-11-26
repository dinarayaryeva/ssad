package com.company.searchEngine;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;

public abstract class Handler {

    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }
    public abstract boolean handle(SearchRequest req, SearchResponse res);
}
