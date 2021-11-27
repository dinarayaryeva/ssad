package com.company;

import com.company.Controllers.SearchEngineDispatcher;
import com.company.httpMessages.SearchRequest.StringSearchRequest;
import com.company.httpMessages.SearchResponse.StringSearchResponse;


public class Main {

    public static void printSearchResults(StringSearchResponse response) {
        if (response.error == null) {
            System.out.printf("Search results:\n%s\n", response.value);
        } else {
            System.out.printf("%s\n", response.error);
        }
    }

    public static void main(String[] args) {

        //Creating the dispatcher to handle search request
        SearchEngineDispatcher dispatcher = new SearchEngineDispatcher();

        //Search request 1
        System.out.printf("Processing search request 1\n");
        StringSearchRequest stringSearchRequest = new StringSearchRequest("LONGLONGLONGLONGLONGLONGLONGLONG" +
                "LONGLONGLONGLONGLONGLONGLOLONGNGLONGLONGLONGLONGLONGLONGLONGLONGLONGLONGLONGLONGLONGLONGLONGLONGLONG");
        StringSearchResponse stringSearchResponse = new StringSearchResponse(); //predefined search response
        dispatcher.handle(stringSearchRequest, stringSearchResponse);
        printSearchResults(stringSearchResponse);

        //Search request 2
        System.out.printf("\nProcessing search request 2\n");
        stringSearchRequest = new StringSearchRequest("hmmm");
        stringSearchResponse = new StringSearchResponse(); //predefined search response
        dispatcher.handle(stringSearchRequest, stringSearchResponse);
        printSearchResults(stringSearchResponse);

        //Search request 3
        System.out.printf("\nProcessing search request 3\n");
        stringSearchRequest = new StringSearchRequest("paragraph1");
        stringSearchResponse = new StringSearchResponse(); //predefined search response
        dispatcher.handle(stringSearchRequest, stringSearchResponse);
        printSearchResults(stringSearchResponse);
    }
}
