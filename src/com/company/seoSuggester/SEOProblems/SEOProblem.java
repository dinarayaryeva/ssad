package com.company.seoSuggester.SEOProblems;

import com.company.seoSuggester.Component;
import com.company.seoSuggester.Compound;
import com.company.seoSuggester.SEOSuggestions.SEOSuggestion;
import com.company.utils.htmlParser.Elements.Element;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public abstract class SEOProblem extends Component implements Compound {
    /**
     * Class (leaf) responsible for determining existence
     * of concrete problem in the document, and it's
     * impact on SEO score
     */

    /**
     * Array of suggestions on fixing the problem
     */
    public ArrayList<Component> suggestions = new ArrayList<>();

    /**
     * Checks whether problem exists in the given array of elements
     * @param eles
     * @return
     */
    public abstract Boolean problemIsPresent(ArrayList<Element> eles);

    public Integer calculateSEOImpact(ArrayList<Element> eles) {

        printImpactPreCalcMsg();

        Integer impact = problemIsPresent(eles) ? getSeoWeight() : 0;

        Boolean problemIsPresent = problemIsPresent(eles);

        printImpactPostCalcMsg(impact);

        return impact;

    }

    /**
     *
     * @param eles array of
     * document's elements
     * @return present in eles problems.
     * Returns problem instance
     * if problem exists.
     */
    public Component getProblems(ArrayList<Element> eles) {
        return problemIsPresent(eles) ? this : null;
    }

    @Override
    public Integer getSeoWeight() {
        return 0;
    }

    @Override
    public ArrayList<Component> getChildComponents() {
        return suggestions;
    }

    @Override
    public ArrayList<SEOSuggestion> getSuggestions() {
        return suggestions.stream().map(c -> Objects.isNull(c) ? new SEOSuggestion() : (SEOSuggestion)c).collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public void setChildComponents(ArrayList<Component> children) {
        suggestions = children;
    }

    @Override
    public void addComponent(Component c) {
        //TODO error handling in case when component is not suggestion
        suggestions.add(c);
    }

    public void printSeoSuggestions() {
        System.out.println(getDescription());
        for (SEOSuggestion s : getSuggestions()){
            System.out.println(s.getDescription());
        }
    }
}
