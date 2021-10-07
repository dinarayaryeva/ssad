package com.company.seoSuggester;

import com.company.seoSuggester.SEOAspect.SEOAspect;
import com.company.seoSuggester.SEOAspect.SEOAspectsContainer;
import com.company.utils.htmlParser.Elements;
import org.w3c.dom.html.HTMLElement;

public interface SEOImpactCalculatable {
    public int calculateSEOImpact(Elements elements, SEOAspectsContainer configAspect);
}
