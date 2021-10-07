package com.company.client;

import com.company.httpMessages.SearchRequest.ExtendedPageVisitRequest;
import com.company.httpMessages.SearchRequest.PageVisitRequest;
import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.ExtendedPageVisitResponse;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.searchEngine.Controllers.PageVisitController;
import com.company.searchEngine.Controllers.SearchRequestController;

public class Client {
    SearchRequestController searchRequestController;
    PageVisitController pageVisitController;

    public Client() {
        searchRequestController = new SearchRequestController();
    }

    public SearchResponse performSearch(SearchRequest request) {
        return searchRequestController.handleSearchRequest(request);
    }

    //Client goes to the original website
    public void visitPage(PageVisitRequest request) {}

    //Requested site opens in iframe alongside with SEO suggestions (check UML for detail description)
    public ExtendedPageVisitResponse visitPageExtended(ExtendedPageVisitRequest request) {
        return pageVisitController.handleExtendedVisitRequest(request);
    }
}
