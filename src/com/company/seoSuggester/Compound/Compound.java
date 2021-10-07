package com.company.seoSuggester.Compound;

public interface Compound {
    // Generic interface to work with uniformly with SEO aspects, problems and suggestions.
    // Provides flexibility in configuration setup.
    public static String name = "";
    public <C> void addComponent(C component);
    public void deleteComponent(String name);
//    public <C> C getComponent(String name);
//    public <C> void replaceComponent(String name, C replacement);
}
