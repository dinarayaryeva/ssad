package com.company.seoSuggester.SEOAspects;

import com.company.seoSuggester.SEOProblems.SEOProblem;

import java.util.ArrayList;

public interface SEOAspectsContainer {

    public ArrayList<SEOAspect> getChildAspects();
    public ArrayList<SEOProblem> getChildProblems();
}
