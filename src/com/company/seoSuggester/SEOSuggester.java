package com.company.seoSuggester;

import com.company.seoSuggester.SEOProblemCollection.SEOProblemCollection;
import com.company.serverManager.ServerManager;
import com.company.utils.htmlParser.Document;
import com.company.utils.htmlParser.Elements.Element;

import java.util.ArrayList;

public class SEOSuggester {
    /**
     * Provides present in the document
     * SEO problems and optimization
     * suggestions
     */

    /**
     * Server mock object
     */
    ServerManager serverConnection;

    /**
     * Configuration object contains
     * all possible problems and suggestions
     */
    SEOProblemCollection seoConfig;

    public SEOSuggester() {
        serverConnection = new ServerManager();
        seoConfig = serverConnection.getSEOConfig();
    }

    /**
     *
     * @param document document to be analyzed
     * @return SEOProblemCollection of all present
     * in document problems
     */
    public Component getProblems(Document document) {

        ArrayList<Element> elements = document.selectAll();

        return seoConfig.getProblems(elements);

    }
}
