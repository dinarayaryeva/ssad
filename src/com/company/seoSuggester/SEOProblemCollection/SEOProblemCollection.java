package com.company.seoSuggester.SEOProblemCollection;

import com.company.seoSuggester.Component;
import com.company.utils.htmlParser.Elements.Element;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class SEOProblemCollection extends Component {

    private static Integer fullSEOScore;
    public static String name;

    private ArrayList<Component> childComponents = null;

    public ArrayList<Component> getChildComponents() {
        return childComponents;
    }

    public SEOProblemCollection() {
        childComponents = new ArrayList<Component>();
    }

    @Override
    public Component getProblems(ArrayList<Element> eles) {
        SEOProblemCollection problemsCollection = new SEOProblemCollection();
        ArrayList<Component> children =  childComponents.stream()
                .map((p) -> p.getProblems(eles.stream()
                        .filter(e -> p.tags.stream()
                                .map(k -> k.getClass())
                                .anyMatch(e.getClass()::equals))
                        .collect(Collectors.toCollection(ArrayList::new))))
                        .collect(Collectors.toCollection(ArrayList::new));
        problemsCollection.setChildComponents(children);
        return problemsCollection;
    }

    //TODO initialize childComponents before parsing
    @Override
    public Integer calculateSEOImpact(ArrayList<Element> eles) {
        return  childComponents.stream().mapToInt((Component c) ->
                c.calculateSEOImpact(
                        eles.stream().filter((Element e) ->
                                c.tags.stream()
                                .map((Element k) -> k.getClass())
                                .anyMatch(e.getClass()::equals)
                        )
                        .collect(Collectors.toCollection(ArrayList::new)))).sum();
    }

    public Integer getFullSEOScore() {
        return SEOProblemCollection.fullSEOScore;
    }

    public void setChildComponents(ArrayList<Component> children) {
        childComponents = children;
    }

    public void addComponent(Component c) {
        childComponents.add(c);
    }

}

