package com.company.searchEngine.Analytics;

import com.company.httpMessages.SearchRequest.ExtendedPageVisitRequest;
import com.company.httpMessages.SearchRequest.PageVisitRequest;
import com.company.httpMessages.SearchResponse.ExtendedPageVisitResponse;
import com.company.searchEngine.Models.Index.DocumentIndex;
import com.company.serverManager.ServerManager;

public class PageVisitAnalytics {

    ServerManager ServersConnection;

    public void gatherVisitAnalytics(ExtendedPageVisitRequest request, ExtendedPageVisitResponse response, DocumentIndex index) {
        index.increaseVisitsCount();
    }
    public void gatherVisitAnalytics(PageVisitRequest request, DocumentIndex index) {
        index.increaseVisitsCount();
    }
}
