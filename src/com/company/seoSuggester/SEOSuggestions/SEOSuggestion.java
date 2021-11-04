package com.company.seoSuggester.SEOSuggestions;

import com.company.seoSuggester.Component;
import com.company.utils.htmlParser.Elements.Element;

import java.util.ArrayList;
import java.util.Arrays;

public class SEOSuggestion extends Component {

    @Override
    public Component getProblems(ArrayList<Element> eles) {
        return null;
    }

    @Override
    public ArrayList<SEOSuggestion> getSuggestions() {
        return new ArrayList<SEOSuggestion>(Arrays.asList(this));
    }

    @Override
    public Integer calculateSEOImpact(ArrayList<Element> eles) {
        return null;
    }

}
