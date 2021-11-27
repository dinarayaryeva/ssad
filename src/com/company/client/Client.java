package com.company.client;

import com.company.httpMessages.SearchRequest.*;
import com.company.httpMessages.SearchResponse.*;
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

    public SearchResponse performStringSearch(StringSearchRequest request) {
        StringSearchResponse response = new StringSearchResponse();
        searchEngineDispatcher.handle(request, response);
        return response;
    }

    public SearchResponse performVoiceSearch(VoiceSearchRequest request) {
        VoiceSearchResponse response = new VoiceSearchResponse();
        searchEngineDispatcher.handle(request, response);
        return response;
    }

    public SearchResponse performImageSearch(ImageSearchRequest request) {
        ImageSearchResponse response = new ImageSearchResponse();
        searchEngineDispatcher.handle(request, response);
        return response;
    }

    //Client goes to the original website
    public void visitPage(PageVisitRequest request) {}

    //Requested site opens in iframe alongside with SEO suggestions
    public ExtendedPageVisitResponse visitPageExtended(ExtendedPageVisitRequest request) {
        return pageVisitController.handleExtendedVisitRequest(request);
    }
}
