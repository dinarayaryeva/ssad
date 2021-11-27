package com.company.searchEngine;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;

public abstract class Handler {

    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handle(SearchRequest req, SearchResponse res) {
        System.out.printf("%s is handling request\n", this.getClass().getSimpleName());
    }
}
