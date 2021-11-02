package com.company.seoSuggester.SEOProblems;

import com.company.seoSuggester.Component;
import com.company.seoSuggester.SEOAspects.SEOAspect;
import com.company.seoSuggester.SEOSuggestions.SEOSuggestion;
import com.company.utils.htmlParser.Element;
import com.company.utils.htmlParser.Elements;
import com.company.utils.htmlParser.Tag;
import java.util.ArrayList;

public abstract class SEOProblem extends Component {
    public static String name;
    public static String description;
    public ArrayList<SEOSuggestion> suggestions;
    public static ArrayList<Tag> tags;

    @Override
    public abstract Integer calculateSEOImpact(ArrayList<Element> eles);

    @Override
    public abstract Component getProblems(ArrayList<Element> eles);

}
