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

    @Override
    public abstract Integer calculateSEOImpact(ArrayList<Element> eles);

    /**
     *
     * @param eles array of
     * document's elements
     * @return present in eles problems.
     * Returns problem instance
     * if problem exists.
     */
    @Override
    public abstract Component getProblems(ArrayList<Element> eles);


}
