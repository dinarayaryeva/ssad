package com.company.seoSuggester.SEOAspect;

import com.company.seoSuggester.SEOImpactCalculatable;
import com.company.seoSuggester.SEOProblem;
import com.company.serverManager.ServerManager;
import com.company.utils.htmlParser.Elements;

import java.util.ArrayList;

public class SEOConfigProxy implements SEOImpactCalculatable, SEOAspectsContainer {
    private SEOAspect config;
    private ServerManager dataServerConnection;
    private int fullSEOScore;
    public SEOConfigProxy() {

        // Loads default SEO aspect configuration object from server
        config = dataServerConnection.getSEOConfig();
        fullSEOScore = dataServerConnection.getFullSeoScore();
    }

    public int getFullSEOScore() {
        return fullSEOScore;
    }

    public void updateSEOConfig() {

        // Waits till finish of operations upon configuration object, updates configuration object,
        // and blocks config callers until update finish
        config = dataServerConnection.updateSEOConfig();

    }

    @Override
    public int calculateSEOImpact(Elements elements, SEOAspectsContainer configAspect) {
        return config.calculateSEOImpact(elements, config);
    }

    @Override
    public ArrayList<SEOAspect> getChildAspects() {
        config.getChildAspects();
    }

    @Override
    public ArrayList<SEOProblem> getChildProblems() {
        config.getChildProblems();
    }
}
