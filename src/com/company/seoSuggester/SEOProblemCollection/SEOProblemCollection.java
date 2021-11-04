package com.company.seoSuggester.SEOProblemCollection;

import com.company.seoSuggester.Component;
import com.company.seoSuggester.Compound;
import com.company.seoSuggester.SEOSuggestions.SEOSuggestion;
import com.company.utils.htmlParser.Elements.Element;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class SEOProblemCollection extends Component implements Compound {
    /**
     * (Compound) class contains problems or another
     * problem collections grouped by interest tags
     */

    private ArrayList<Component> childComponents = new ArrayList<>();

    public ArrayList<Component> getChildComponents() {
        return childComponents;
    }

    public void setChildComponents(ArrayList<Component> children) {
        childComponents = children;
    }

    public void addComponent(Component c) {
        childComponents.add(c);
    }

    /**
     *
     * @param eles array of
     * document's elements
     * @return present in eles problems.
     * Returns problems collection contains existing
     * problems
     */
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


    @Override
    public Integer calculateSEOImpact(ArrayList<Element> eles) {

        printImpactPreCalcMsg();

        Integer impact = childComponents.stream().mapToInt((Component c) ->
                c.calculateSEOImpact(
                        eles.stream().filter((Element e) ->
                                c.tags.stream()
                                .map((Element k) -> k.getClass())
                                .anyMatch(e.getClass()::equals)
                        )
                        .collect(Collectors.toCollection(ArrayList::new)))).sum();

        printImpactPostCalcMsg(impact);

        return impact;

    }

    @Override
    public ArrayList<SEOSuggestion> seoSuggestions() {
        ArrayList<SEOSuggestion> seoSuggestions = new ArrayList<SEOSuggestion>();
        childComponents.stream()
                .map(c -> c.getSuggestions())
                .flatMap(Collection::stream)
                .collect(Collectors.toCollection(ArrayList::new));
    }



}

