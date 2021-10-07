package com.company.seoSuggester.SEOAspect;

import com.company.seoSuggester.SEOProblem;

import java.util.ArrayList;

public interface SEOAspectsContainer {

    public ArrayList<SEOAspect> getChildAspects();
    public ArrayList<SEOProblem> getChildProblems();
}
