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

    public static void printSearchResults(StringSearchResponse response) {
        if (response.error == null) {
            System.out.printf("Search results:\n%s\n", response.value);
        }
        else {
            System.out.printf("%s\n", response.error);
        }
    }

    public static void main(String[] args) {

        SearchEngineDispatcher dispatcher = new SearchEngineDispatcher();

        System.out.printf("Processing search request 1\n");
        StringSearchRequest stringSearchRequest = new StringSearchRequest("LONGLONGLONGLONGLONGLONGLONGLONG" +
                "LONGLONGLONGLONGLONGLONGLOLONGNGLONGLONGLONGLONGLONGLONGLONGLONGLONGLONGLONGLONGLONGLONGLONGLONGLONG");
        StringSearchResponse stringSearchResponse = new StringSearchResponse();
        dispatcher.handle(stringSearchRequest, stringSearchResponse);
        printSearchResults(stringSearchResponse);


        System.out.printf("\nProcessing search request 2\n");
        stringSearchRequest = new StringSearchRequest("hmmm");
        stringSearchResponse = new StringSearchResponse();
        dispatcher.handle(stringSearchRequest, stringSearchResponse);
        printSearchResults(stringSearchResponse);

        System.out.printf("\nProcessing search request 3\n");
        stringSearchRequest = new StringSearchRequest("paragraph1");
        stringSearchResponse = new StringSearchResponse();
        dispatcher.handle(stringSearchRequest, stringSearchResponse);
        printSearchResults(stringSearchResponse);
    }
}
