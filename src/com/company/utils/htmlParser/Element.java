package com.company.utils.htmlParser;

import java.util.ArrayList;

public class Element {
    public String value;
    public ArrayList<Element> children;

    public Element() {}

    public Element(String value) {
        this.value = value;
    }

}
