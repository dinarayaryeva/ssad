package com.company.seoSuggester.SEOProblems;

import com.company.seoSuggester.Component;
import com.company.seoSuggester.SEOSuggestions.SEOSuggestion;
import com.company.utils.htmlParser.Elements.Element;

import java.util.ArrayList;

public abstract class SEOProblem extends Component {
    /**
     * Class (leaf) responsible for determining existence
     * of concrete problem in the document, and it's
     * impact on SEO score
     */

    /**
     * Array of suggestions on fixing the problem
     */
    public ArrayList<SEOSuggestion> suggestions;

    /**
     * Checks whether problem exists in the given array of elements
     * @param eles
     * @return
     */
    public abstract Boolean problemIsPresent(ArrayList<Element> eles);

    public Integer calculateSEOImpact(ArrayList<Element> eles) {

        printImpactPreCalcMsg();

        Integer impact = problemIsPresent(eles) ? seoWeight : 0;

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

}
