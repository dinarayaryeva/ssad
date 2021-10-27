package com.company.serverManager;

import com.company.searchEngine.Lexicon.Lexicon;
import com.company.searchEngine.Models.Index.DocumentIndex;
import com.company.searchEngine.Models.Index.WordIndex;
import com.company.seoSuggester.SEOAspects.SEOAspect;
import com.company.utils.PlainDocument;

import java.io.InputStream;
import java.util.ArrayList;

public class ServerManager {

    // SEO configuration object

    public SEOAspect getSEOConfig() {
        return new SEOAspect();
    }

    public SEOAspect updateSEOConfig() {
        return new SEOAspect();
    }


    // Indexing

    public void storeIndex(DocumentIndex index) {}

    public void updateIndex(DocumentIndex index) {}

    public int getFullSeoScore() {
        return (int)Math.random();
    }

    public String getPlainDocument(int plainDocId) {
        return "";
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

    public ArrayList<DocumentIndex> fetchMatchingIndexes(String query) {
        return new ArrayList<DocumentIndex>();
    }

    public Lexicon getLexicon() {
        return new Lexicon();
    }

    public void updateLexicon() {
    }
}
