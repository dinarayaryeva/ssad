package com.company.searchEngine.Searcher;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.searchEngine.Models.Index.DocumentIndex;
import com.company.serverManager.ServerManager;

import java.util.ArrayList;
import java.util.Arrays;

public class StringSearcher extends Searcher {

    ServerManager serversConnection;


    public StringSearcher() {
        serversConnection = new ServerManager();

    }

    /**
     * Fetches keywords from the query string
     *
     * @param query
     * @return array of keywords
     */
    public ArrayList<String> fetchKeywords(String query) {
        return new ArrayList<String>(Arrays.asList(query.toLowerCase().split(" ")));
    }

    /**
     * Filters pages that contain keywords by relevance. Since such filtering is complex task,
     * for the demo project initial indices list returned
     *
     * @param query
     * @param indices
     * @param pagesCount
     * @return
     */
    public ArrayList<DocumentIndex> getRelevantPages(ArrayList<String> query, ArrayList<DocumentIndex> indices, Integer pagesCount) {
        return indices;
    }

    /**
     * Searches relevant web-pages based on query
     *
     * @param request
     * @param response
     * @return Array of relevant document indices
     */
    @Override
    public void handle(SearchRequest request, SearchResponse response) {

        super.handle(request, response);

        //Search string
        String query = request.value;

        System.out.printf("Searching pages for query: %s\n", query);

        //Number of pages to return, isn't configured yet
        Integer pagesCount = request.pagesCount;

        ArrayList<String> keywords = fetchKeywords(query);

        //Downloading all documents containing keywords
        ArrayList<DocumentIndex> indexes = serversConnection.fetchMatchingIndices(keywords);

        //Filtering pages by relevance
        indexes = getRelevantPages(keywords, indexes, pagesCount);

        if (indexes.size() == 0) {
            response.value = "No pages found.";
            return;
        }

        response.value = indexes.toString();

        //Gathering analytics about performed web-search
        next.handle(request, response);

    }
}
