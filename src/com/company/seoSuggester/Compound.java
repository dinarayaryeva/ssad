package com.company.seoSuggester;

import java.util.ArrayList;

public interface Compound {

    public ArrayList<Component> getChildComponents();
    public void setChildComponents(ArrayList<Component> children);
    public void addComponent(Component c);

}
