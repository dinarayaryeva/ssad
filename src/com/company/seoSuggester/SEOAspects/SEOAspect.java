package com.company.seoSuggester.SEOAspects;

import com.company.seoSuggester.Component;
import com.company.seoSuggester.SEOProblems.SEOProblem;
import com.company.seoSuggester.SEOSuggestions.SEOSuggestion;
import com.company.utils.htmlParser.Element;
import com.company.utils.htmlParser.Elements;
import com.company.utils.htmlParser.Tag;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class SEOAspect extends Component {

    private static Integer fullSEOScore;
    public static String name;

    private ArrayList<Component> childComponents;

    public ArrayList<Component> getChildComponents() {
        return childComponents;
    }

    @Override
    public Component getProblems(ArrayList<Element> eles) {
        return null;
    }

    @Override
    public Integer calculateSEOImpact(ArrayList<Element> eles) {
        return  childComponents.stream().mapToInt((p) ->
                p.calculateSEOImpact(eles.stream()
                        .filter(e -> p.tags.stream().anyMatch(e.getClass()::equals))
                        .collect(Collectors.toCollection(ArrayList::new)))).sum();
    }

//    .toList()
//    .collect(Collectors
//                     .toCollection(ArrayList::new));
    public Integer getFullSEOScore() {
        return SEOAspect.fullSEOScore;
    }


    public void addComponent(Component c) {

    }

}

