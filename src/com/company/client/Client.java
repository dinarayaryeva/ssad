package com.company.client;

import com.company.httpMessages.SearchRequest.ExtendedPageVisitRequest;
import com.company.httpMessages.SearchRequest.PageVisitRequest;
import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.ExtendedPageVisitResponse;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.Controllers.PageVisitController;
import com.company.Controllers.SearchEngineDispatcher;

public class Client {
    /**
     * Emulates actions of the user (browser)
     */


    SearchEngineDispatcher searchEngineDispatcher;
    PageVisitController pageVisitController;

    public Client() {
        searchEngineDispatcher = new SearchEngineDispatcher();
    }

    public SearchResponse performSearch(SearchRequest request) {
        return searchEngineDispatcher.dispatchSearchRequest(request);
    }

    //Client goes to the original website
    public void visitPage(PageVisitRequest request) {}

    //Requested site opens in iframe alongside with SEO suggestions
    public ExtendedPageVisitResponse visitPageExtended(ExtendedPageVisitRequest request) {
        return pageVisitController.handleExtendedVisitRequest(request);
    }
}
