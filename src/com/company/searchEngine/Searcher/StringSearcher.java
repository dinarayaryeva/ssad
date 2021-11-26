package com.company.searchEngine.Searcher;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.searchEngine.Lexicon.LexiconManager;
import com.company.searchEngine.Models.Index.DocumentIndex;
import com.company.serverManager.ServerManager;

import java.util.ArrayList;

public class StringSearcher extends Searcher {

    ServerManager serversConnection;
    LexiconManager lexiconManager;

    public StringSearcher() {
        serversConnection = new ServerManager();
    }

    public ArrayList<String> fetchKeywords(String query) {
        return new ArrayList<String>();
    }

    public ArrayList<DocumentIndex> getRelevantPages(String query, ArrayList<DocumentIndex> indexes, Integer pagesCount) {
        return new ArrayList<DocumentIndex>();
    }

    @Override
    public boolean handle(SearchRequest request, SearchResponse response) {

        String query = request.value;
        Integer pagesCount = request.pagesCount;

        ArrayList<String> keywords = fetchKeywords(query);

        ArrayList<DocumentIndex> indexes = serversConnection.fetchMatchingIndexes(query);
        indexes = getRelevantPages(query, indexes, pagesCount);

        if (indexes.size() == 0) {
            response.value = "No pages found.";
            return false;
        }

        response.value = indexes.toString();
        next.handle(request, response);

        return false;
    }
}
