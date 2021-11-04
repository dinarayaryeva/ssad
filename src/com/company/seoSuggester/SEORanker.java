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

    /**
     * Server mock object
     */
    public ServerManager serverConnection;

    /**
     * Configuration object contains
     * all possible problems and suggestions
     */
    public SEOProblemCollection seoConfig;

    /**
     * Maximum possible document's SEO score.
     * (Can be obtained in case if document
     * has no problems)
     */
    private Integer maxSEOScore;

    public SEORanker() {
        serverConnection = new ServerManager();
        seoConfig = serverConnection.getSEOConfig();
        maxSEOScore = serverConnection.getFullSeoScore();
    }

    public Integer getMaxSEOScore() {
        return maxSEOScore;
    }

    /**
     *
     * @param document document to be analyzed
     * @return document's SEO rank
     */
    public Integer calculateDocumentRank(Document document) {

        System.out.printf("Calculating SEO rank of document '%s':\n", document.getTitle());

        ArrayList<Element> elements = document.selectAll();

        int problemsImpact = seoConfig.calculateSEOImpact(elements);

        /**
         * Retrieving page rank by subtracting summary impact of
         * all present problems from maximum possible score
         */
        return maxSEOScore - problemsImpact;
    }


}
