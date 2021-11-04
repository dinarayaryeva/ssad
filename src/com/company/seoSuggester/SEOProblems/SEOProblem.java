package com.company.seoSuggester.SEOProblems;

import com.company.seoSuggester.Component;
import com.company.seoSuggester.SEOSuggestions.SEOSuggestion;
import com.company.utils.htmlParser.Elements.Element;

import java.util.ArrayList;

public abstract class SEOProblem extends Component {

    public static String name;
    public static String description;
    private static Integer weight = 0;
    public ArrayList<SEOSuggestion> suggestions;

    @Override
    public abstract Integer calculateSEOImpact(ArrayList<Element> eles);

    @Override
    public abstract Component getProblems(ArrayList<Element> eles);

    public void printImpactPreCalcMsg() {
        System.out.printf("Calculating impact of %s\n", this.getClass().getSimpleName());
    }

    public void printImpactPostCalcMsg(Integer impact) {
        System.out.printf("Impact of %s is %d\n", this.getClass().getSimpleName(), impact);
    }
}
