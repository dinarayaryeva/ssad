package com.company.seoSuggester;

import com.company.utils.htmlParser.Elements.Element;

import java.util.ArrayList;

public abstract class Component {
    /**
     * Class contains common properties
     * and methods for compounds and leaves
     * (SEOProblemCollections and SEOProblems)
     */

    protected String description;


    /**
     * Array of tags component
     * is interested in
     */
    public ArrayList<Element> tags;

    /**
     *
     * @param eles array of
     * document's elements
     * @return present in eles problems.
     * For problems returns problem instance
     * if problem exists. For problem collections
     * returns problems collection contains existing
     * problems
     */
    public abstract Component getProblems(ArrayList<Element> eles);

    /**
     *
     * @param eles array of
     * document's elements
     * @return total problems' impact
     */
    public abstract Integer calculateSEOImpact(ArrayList<Element> eles);

    public String getDescription() {
        return description;
    }

    public Integer getSeoWeight() {
        return 0;
    }

    public void printImpactPreCalcMsg() {
        System.out.printf("Calculating impact of %s\n", this.getClass().getSimpleName());
    }

    public void printImpactPostCalcMsg(Integer impact) {
        System.out.printf("Impact of %s is %d\n", this.getClass().getSimpleName(), impact);
    }
}
