package com.company.serverManager;

import com.company.searchEngine.Models.Index.DocumentIndex;
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
}
