package com.company.seoSuggester;

import com.company.seoSuggester.SEOProblemCollection.SEOProblemCollection;
import com.company.serverManager.ServerManager;
import com.company.utils.htmlParser.Document;
import com.company.utils.htmlParser.Elements.Element;

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

    public Integer getFullSEOScore() {
        return fullSEOScore;
    }

    public int calculateDocumentRank(Document document) {

        System.out.printf("Calculating SEO rank of document '%s':\n", document.getTitle());

        ArrayList<Element> elements = document.selectAll();

        int problemsImpact = seoConfig.calculateSEOImpact(elements);

        /**
         * Retrieving page rank by subtracting summary impact of
         * all present problems from maximum possible score
         */
        return fullSEOScore - problemsImpact;
    }


}
