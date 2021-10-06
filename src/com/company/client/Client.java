package com.company.client;

import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.searchEngine.Controllers.SearchRequestController;

public class Client {
    SearchRequestController searchRequestController;

    public Client() {
        searchRequestController = new SearchRequestController();
    }

//    public SearchResponse performSearch() {
//
//    }
}
