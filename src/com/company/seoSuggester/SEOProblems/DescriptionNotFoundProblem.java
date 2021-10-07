package com.company.seoSuggester.SEOProblems;

import com.company.seoSuggester.SEOAspects.SEOAspectsContainer;
import com.company.utils.htmlParser.Elements;

public class DescriptionNotFoundProblem extends SEOProblem {
    @Override
    public int calculateSEOImpact(Elements elements, SEOAspectsContainer configAspect) {
        return 0;
    }
}
