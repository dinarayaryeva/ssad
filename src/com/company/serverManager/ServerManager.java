package com.company.serverManager;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.searchEngine.Lexicon.Lexicon;
import com.company.searchEngine.Models.Index.DocumentIndex;
import com.company.searchEngine.Models.Index.WordIndex;
import com.company.seoSuggester.SEOProblemCollection.MetaTagsUsage.MetaTagsUsage;
import com.company.seoSuggester.SEOProblemCollection.MetaTagsUsage.PageDescriptionUsage;
import com.company.seoSuggester.SEOProblemCollection.MetaTagsUsage.TitleUsage;
import com.company.seoSuggester.SEOProblemCollection.SEOProblemCollection;
import com.company.seoSuggester.SEOProblems.DescriptionNotFoundProblem;
import com.company.seoSuggester.SEOProblems.TitleLengthProblem;
import com.company.seoSuggester.SEOSuggestions.DescriptionNotFoundSuggestion;
import com.company.seoSuggester.SEOSuggestions.TitleLengthSuggestion;
import com.company.utils.PlainDocument;

import java.io.InputStream;
import java.util.ArrayList;

public class ServerManager {
    /**
     * Server connection mock class
     */

    public SEOProblemCollection getSEOConfig() {

        SEOProblemCollection seoConfig = new SEOProblemCollection();

        MetaTagsUsage metaTagsUsage = new MetaTagsUsage();

        TitleUsage titleUsage = new TitleUsage();
        TitleLengthProblem titleLengthProblem = new TitleLengthProblem();
        TitleLengthSuggestion titleLengthSuggestion = new TitleLengthSuggestion();
        titleLengthProblem.addComponent(titleLengthSuggestion);
        titleUsage.addComponent(titleLengthProblem);

        PageDescriptionUsage descriptionUsage = new PageDescriptionUsage();
        DescriptionNotFoundProblem descriptionNotFoundProblem = new DescriptionNotFoundProblem();
        DescriptionNotFoundSuggestion descriptionNotFoundSuggestion = new DescriptionNotFoundSuggestion();
        descriptionNotFoundProblem.addComponent(descriptionNotFoundSuggestion);
        descriptionUsage.addComponent(descriptionNotFoundProblem);

        metaTagsUsage.addComponent(titleUsage);
        metaTagsUsage.addComponent(descriptionUsage);
        seoConfig.addComponent(metaTagsUsage);

        return seoConfig;
    }

    public SEOProblemCollection updateSEOConfig() {
        return new SEOProblemCollection();
    }


    // Indexing

    public void storeIndex(DocumentIndex index) {}

    public void updateIndex(DocumentIndex index) {}

    //TODO SEOConfig iterator for max score
    public int getFullSeoScore() {
        return 50;
    }

    public String getPlainDocument(int plainDocId) {
        return "";
    }

    public ArrayList<DocumentIndex> fetchMatchingIndexes(String query) {
        return new ArrayList<DocumentIndex>();
    }

    public void storeUrlsOnUrlServer(String url) {
    }
    // Working with url server

    public void storeUrlsOnUrlServer(InputStream is) {}

    public void storeUrlOnUrlServer(String url) {}

    public ArrayList<String> fetchUrlsList() {
        return new ArrayList<String>();
    }

    // Working with documents and indexes
    public void storePlainDocument(PlainDocument doc) {
    }

    public ArrayList<DocumentIndex> getDocumentIndexes() {
        return new ArrayList<DocumentIndex>();
    }
    

    public void updateWordIndex(WordIndex wordIndex) {
    }

    public void createWordIndex(WordIndex index) {
    }


    // Working with lexicon
    public Lexicon getLexicon() {
        return new Lexicon();
    }

    public void updateLexicon() {
    }

    // Working with analytics
    public void gatherSearchAnalytics(SearchRequest request, SearchResponse response) {

    }

}
