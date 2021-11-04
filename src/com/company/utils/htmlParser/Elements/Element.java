package com.company.utils.htmlParser.Elements;

import java.util.ArrayList;

public abstract class Element {

    public String value;
    public ArrayList<Element> children;

    public Element() {}

    public Element(String value) {
        this.value = value;
    }

}
