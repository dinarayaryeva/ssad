package com.company.searchEngine.Searcher;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.ImageSearchResponse;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.httpMessages.SearchResponse.StringSearchResponse;
import com.company.searchEngine.Lexicon.LexiconManager;
import com.company.searchEngine.Models.Index.DocumentIndex;
import com.company.serverManager.ServerManager;

import java.util.ArrayList;

public class StringSearcher extends Searcher {
    ServerManager serversConnection;
    LexiconManager lexiconManager;

    public ArrayList<String> fetchKeywords(String query) {
        return new ArrayList<String>();
    }

    public ArrayList<DocumentIndex> getRelevantPages(String query, ArrayList<DocumentIndex> indexes, Integer pagesCount) {
        return new ArrayList<DocumentIndex>();
    }

    @Override
    public SearchResponse search(SearchRequest searchRequest) {

        String query = searchRequest.query;
        Integer pagesCount = searchRequest.pagesCount;

        ArrayList<String> keywords = fetchKeywords(query);

        ArrayList<DocumentIndex> indexes = serversConnection.fetchMatchingIndexes(query);
        indexes = getRelevantPages(query, indexes, pagesCount);

        return new StringSearchResponse(indexes);
    }
}
