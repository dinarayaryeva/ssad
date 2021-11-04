package com.company.seoSuggester;

import com.company.utils.htmlParser.Elements.Element;

import java.util.ArrayList;

public abstract class Component {

    private String description;

    public static ArrayList<Element> tags;

    public abstract Component getProblems(ArrayList<Element> eles);

    public abstract Integer calculateSEOImpact(ArrayList<Element> eles);

    public String getDescription() {
        return description;
    }

    public void printImpactPreCalcMsg() {
        System.out.printf("Calculating impact of %s\n", this.getClass().getSimpleName());
    }

    public void printImpactPostCalcMsg(Integer impact) {
        System.out.printf("Impact of %s is %d\n", this.getClass().getSimpleName(), impact);
    }
}
