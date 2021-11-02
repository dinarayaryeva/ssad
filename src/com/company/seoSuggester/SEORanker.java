package com.company.seoSuggester;

import com.company.searchEngine.Models.Index.DocumentIndex;
import com.company.seoSuggester.SEOProblemCollection.SEOProblemCollection;
import com.company.serverManager.ServerManager;
import com.company.utils.htmlParser.Document;
import com.company.utils.htmlParser.Element;
import com.company.utils.htmlParser.HTMLParser;

import java.util.ArrayList;

public class SEORanker {
    /**
     * Calculates SEO rank of the document
     */
    public ServerManager serverConnection;
    public SEOProblemCollection seoConfig;
    private Integer fullSEOScore;

    public SEORanker() {
        serverConnection = new ServerManager();
        seoConfig = serverConnection.getSEOConfig();
        fullSEOScore = serverConnection.getFullSeoScore();
    }

    public int calculateDocumentRank(Document document) {

        ArrayList<Element> elements = document.selectAll();

        int problemsImpact = seoConfig.calculateSEOImpact(elements);
        return fullSEOScore - problemsImpact;
    }

    public Integer getFullSEOScore() {
        return fullSEOScore;
    }
}
