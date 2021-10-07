package com.company.seoSuggester.SEOAspects;

import com.company.seoSuggester.Compound.Compound;
import com.company.seoSuggester.SEOImpactCalculatable;
import com.company.seoSuggester.SEOProblems.SEOProblem;
import com.company.utils.htmlParser.Elements;
import com.company.utils.htmlParser.Tag;

import java.util.ArrayList;

//Interface and proxy implementation fix needed
public class SEOAspect implements SEOImpactCalculatable, Compound, SEOAspectsContainer {

    public static SEOConfigProxy seoConfigProxy;
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

    public int calculateSEOImpact(Elements elements, SEOAspectsContainer configAspect) {

        int currentAspectImpact = 0;

        if (seoProblems != null) {
            currentAspectImpact = configAspect.seoProblems.stream().mapToInt((p) ->
                    p.calculateSEOImpact(elements.filter(p.tags), configAspect)).sum();
        }

        if (configAspect.childAspects == null || configAspect.childAspects.isEmpty()) {
            return currentAspectImpact;
        }

        int childAspectsImpact = configAspect.childAspects.stream().mapToInt((a) ->
                a.calculateSEOImpact(elements.filter(a.tags), a)).sum();

        return currentAspectImpact + childAspectsImpact;

    }

    public SEOAspect getSEOSuggestions() {
        //Recursively iterate over child aspects and problems, in result aspect add only aspects with existing problems
        return new SEOAspect();
    }

    @Override
    public <C> void addComponent(C component) {
        if (component instanceof SEOAspect) {
            childAspects.add((SEOAspect) component);
        }
        else if (component instanceof SEOProblem) {
            seoProblems.add((SEOProblem) component);
        }
        //            throw new InvalidComponentClassException("Invalid component class");
    }

    @Override
    public void deleteComponent(String name) {

    }
}

