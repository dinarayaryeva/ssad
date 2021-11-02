package com.company.searchEngine.Controllers;

import com.company.httpMessages.SearchRequest.ExtendedPageVisitRequest;
import com.company.httpMessages.SearchRequest.PageVisitRequest;
import com.company.httpMessages.SearchResponse.ExtendedPageVisitResponse;
import com.company.searchEngine.Analytics.PageVisitAnalytics;
import com.company.searchEngine.Models.Index.DocumentIndex;
import com.company.searchEngine.PageFetcher;
import com.company.seoSuggester.Component;
import com.company.seoSuggester.KeywordsSuggester;
import com.company.seoSuggester.SEOSuggester;
import com.company.serverManager.ServerManager;
import com.company.utils.URLToDocidConverter;

import java.util.ArrayList;

public class PageVisitController {
    /**
     * Controller responsible for redirecting
     * client to the web-page.
     */
    ServerManager dataServerConnection;
    PageVisitAnalytics pageVisitAnalytics;
    PageFetcher pageFetcher;
    URLToDocidConverter urlToDocidConverter;
    SEOSuggester seoSuggester;
    KeywordsSuggester keywordsSuggester;

    /**
     * Client performs regular page visit request. Engine redirects
     * client to the page and gathers analytics.
     */
    public void handleVisitRequest(PageVisitRequest request) {
        String url = request.url;
        int docId = urlToDocidConverter.convert(url);

        DocumentIndex index = DocumentIndex.getIndexById(docId);

        if (index != null) {
            /**
             * Increasing visits counter for the page
             */
            pageVisitAnalytics.gatherVisitAnalytics(request, index);
        }
    }

    /**
     * User performs page visit request with SEO
     * suggestions.
     * Engine opens requested page in iframe alongside with
     * suggestions (check UML for detail description) and gathers analytics
     */
    public ExtendedPageVisitResponse handleExtendedVisitRequest(ExtendedPageVisitRequest request) {
        String url = request.url;
        int docId = urlToDocidConverter.convert(url);

        DocumentIndex index = DocumentIndex.getIndexById(docId);

        if (index == null) {
            /**
             * Page is not found in the searcher database.
             * Extracting it from the web.
             */
            index = pageFetcher.fetchFromLiveURL(url);
        }

        if (index == null) {
            // Can't find page with such url, response modifying needed
            // in order to represent error
            return null;
        }

        /**
         * Gathering suggestions for the webpage.
         */
        Component seoSuggestions = seoSuggester.getSEOSuggestions(index);
        ArrayList<String> keywordsSuggestions = keywordsSuggester.suggestKeywords(index);

        ExtendedPageVisitResponse response = new ExtendedPageVisitResponse(url, seoSuggestions, keywordsSuggestions);

        // Interface fix needed (unify methods)
        pageVisitAnalytics.gatherVisitAnalytics(request, response, index);

        return response;


    }
}
