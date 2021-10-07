package com.company.searchEngine.Controllers;

import com.company.httpMessages.SearchRequest.ExtendedPageVisitRequest;
import com.company.httpMessages.SearchRequest.PageVisitRequest;
import com.company.httpMessages.SearchResponse.ExtendedPageVisitResponse;
import com.company.searchEngine.Analytics.PageVisitAnalytics;
import com.company.searchEngine.Models.Index.DocumentIndex;
import com.company.searchEngine.PageFetcher;
import com.company.seoSuggester.KeywordsSuggester;
import com.company.seoSuggester.SEOAspects.SEOAspect;
import com.company.seoSuggester.SEOSuggester;
import com.company.serverManager.ServerManager;
import com.company.utils.URLToDocidConverter;

import java.util.ArrayList;

public class PageVisitController {
    ServerManager dataServerConnection;
    PageVisitAnalytics pageVisitAnalytics;
    PageFetcher pageFetcher;
    URLToDocidConverter urlToDocidConverter;
    SEOSuggester seoSuggester;
    KeywordsSuggester keywordsSuggester;

    public void handleVisitRequest(PageVisitRequest request) {
        String url = request.url;
        int docId = urlToDocidConverter.convert(url);

        DocumentIndex index = DocumentIndex.getIndexById(docId);

        if (index != null) {
            pageVisitAnalytics.gatherVisitAnalytics(request, index);
        }
    }

    public ExtendedPageVisitResponse handleExtendedVisitRequest(ExtendedPageVisitRequest request) {
        String url = request.url;
        int docId = urlToDocidConverter.convert(url);

        DocumentIndex index = DocumentIndex.getIndexById(docId);

        if (index == null) {
            index = pageFetcher.fetchFromLiveURL(url);
        }

        if (index == null) {
            // Can't find page with such url, response modifying needed
            return null;
        }

        SEOAspect seoSuggestions = seoSuggester.getSEOSuggestions(index);
        ArrayList<String> keywordsSuggestions = keywordsSuggester.suggestKeywords(index);

        ExtendedPageVisitResponse response = new ExtendedPageVisitResponse(url, seoSuggestions, keywordsSuggestions);

        pageVisitAnalytics.gatherVisitAnalytics(request, response, index);

        return response;


    }
}
