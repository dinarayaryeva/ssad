package com.company.seoSuggester;

import com.company.seoSuggester.SEOAspects.SEOAspectsContainer;
import com.company.utils.htmlParser.Elements;

public interface SEOImpactCalculatable {
    public int calculateSEOImpact(Elements elements, SEOAspectsContainer configAspect);
}
