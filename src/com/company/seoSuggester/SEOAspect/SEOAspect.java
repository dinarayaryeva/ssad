package com.company.seoSuggester.SEOAspect;

import com.company.seoSuggester.Compound.Compound;
import com.company.seoSuggester.Compound.InvalidComponentClassException;
import com.company.seoSuggester.SEOImpactCalculatable;
import com.company.seoSuggester.SEOProblem;
import com.company.utils.htmlParser.Elements;
import com.company.utils.htmlParser.Tag;

import java.util.ArrayList;

public class SEOAspect implements SEOImpactCalculatable, Compound {

    public static SEOConfigProxy seoConfigProxy;
    public static String name;
    public static ArrayList<Tag> tags;
    public ArrayList<SEOAspect> childAspects;
    public ArrayList<SEOProblem> seoProblems;

    public int calculateSEOImpact(Elements elements, SEOAspect configAspect) {

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

