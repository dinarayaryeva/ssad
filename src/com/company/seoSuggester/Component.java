package com.company.seoSuggester;

import com.company.seoSuggester.SEOAspects.SEOAspect;
import com.company.seoSuggester.SEOSuggestions.SEOSuggestion;
import com.company.utils.htmlParser.Element;
import com.company.utils.htmlParser.Elements;

import java.util.ArrayList;

public abstract class Component {

    public static ArrayList<Element> tags;

    public abstract Component getProblems(ArrayList<Element> eles);

    public abstract Integer calculateSEOImpact(ArrayList<Element> eles);
}
