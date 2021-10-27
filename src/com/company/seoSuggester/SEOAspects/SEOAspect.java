package com.company.seoSuggester.SEOAspects;

import com.company.seoSuggester.Component;
import com.company.seoSuggester.SEOProblems.SEOProblem;
import com.company.seoSuggester.SEOSuggestions.SEOSuggestion;
import com.company.utils.htmlParser.Elements;
import com.company.utils.htmlParser.Tag;

import java.util.ArrayList;

public class SEOAspect extends Component {

    public Integer fullSEOScore;
    public static String name;
    public static ArrayList<Tag> tags;
    private ArrayList<SEOAspect> childAspects;
    private ArrayList<SEOProblem> seoProblems;


    public ArrayList<SEOAspect> getChildAspects() {
        return childAspects;
    }


    public ArrayList<SEOProblem> getChildProblems() {
        return seoProblems;
    }

    @Override
    public ArrayList<SEOSuggestion> getSuggestions(Elements eles) {
        return null;
    }

    public static Integer calculateSEOImpact(Elements elements) {
        return 0;
    }


    public void addComponent(Component c) {

    }

}

