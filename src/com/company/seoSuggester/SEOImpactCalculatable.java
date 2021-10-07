package com.company.seoSuggester;

import com.company.seoSuggester.SEOAspect.SEOAspect;
import org.w3c.dom.html.HTMLElement;

public interface SEOImpactCalculatable {
    public int calculateSEOImpact(HTMLElement elements[], SEOAspect configAspect);
}
