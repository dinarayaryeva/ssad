package com.company.searchEngine.Analytics;

import com.company.httpMessages.SearchRequest.ExtendedPageVisitRequest;
import com.company.httpMessages.SearchRequest.PageVisitRequest;
import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.ExtendedPageVisitResponse;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.searchEngine.Models.DocumentIndex;

public class PageVisitAnalytics extends Analytics {

    public void gatherVisitAnalytics(ExtendedPageVisitRequest request, ExtendedPageVisitResponse response, DocumentIndex index) {
        index.increaseVisitsCount();
    }
    public void gatherVisitAnalytics(PageVisitRequest request, DocumentIndex index) {
        index.increaseVisitsCount();
    }
}
