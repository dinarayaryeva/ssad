package com.company.serverManager;

import com.company.searchEngine.Models.DocumentIndex;
import com.company.seoSuggester.SEOAspect.SEOAspect;
import com.company.utils.htmlParser.Document;

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
}
