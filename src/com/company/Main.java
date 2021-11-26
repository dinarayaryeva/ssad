package com.company;

import com.company.Controllers.SearchEngineDispatcher;
import com.company.httpMessages.SearchRequest.StringSearchRequest;
import com.company.httpMessages.SearchResponse.StringSearchResponse;
import com.company.seoSuggester.Component;
import com.company.seoSuggester.SEORanker;
import com.company.seoSuggester.SEOSuggester;
import com.company.utils.htmlParser.Document;
import com.company.utils.htmlParser.Elements.Element;
import com.company.utils.htmlParser.Elements.PageDescription;
import com.company.utils.htmlParser.Elements.Title;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        SearchEngineDispatcher dispatcher = new SearchEngineDispatcher();

        StringSearchRequest stringSearchRequest = new StringSearchRequest("WTF");
        StringSearchResponse stringSearchResponse = new StringSearchResponse();
        dispatcher.handle(stringSearchRequest, stringSearchResponse);

        stringSearchRequest = new StringSearchRequest("WTF");
        stringSearchResponse = new StringSearchResponse();
        dispatcher.handle(stringSearchRequest, stringSearchResponse);

        stringSearchRequest = new StringSearchRequest("WTF");
        stringSearchResponse = new StringSearchResponse();
        dispatcher.handle(stringSearchRequest, stringSearchResponse);

    }
}
